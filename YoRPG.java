//Edward Ro, Taylor Wong
//YoRPG Assignment
//Team Roylor

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;
    private Character smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int typeOfClass;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates chosen class
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	
	System.out.print( "\nIntrepid explorer, what doth thy call thyself? (State your name): " );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) {
	    name = "The Unnamed One";
	}

	s = "\nChoose your class:\n";
	pat = new Warrior();
	s += "\t1: Warrior: " + pat.about() + "\n";
	pat = new Mage();
	s += "\t2: Mage: " + pat.about() + "\n";
	pat = new Rogue();
	s += "\t3: Rogue: " + pat.about() + "\n";
	pat = new Archer();
	s += "\t4: Archer: " + pat.about() + "\n";
	pat = new Goblin();
	s += "\t5: Goblin: " + pat.about() + "\n";	    
	System.out.print (s);

	try {
	    typeOfClass  = Integer.parseInt(in.readLine());
	    //instantiate the player's character
	    if (typeOfClass == 1) {pat = new Warrior( name );}
	    else if (typeOfClass == 2) {pat = new Mage ( name );}
	    else if (typeOfClass == 3) {pat = new Rogue ( name );}
		else if (typeOfClass == 4) {pat = new Archer ( name );}
		else {pat = new Goblin ( name );}
	}
	catch ( IOException e ) {System.out.print ("Please type the desired class's number.");}
    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );

	else {  	    

	    //generate random enemy
	    int enemyChoice = (int)(Math.random()*6);
	    if (enemyChoice == 0) {
		smaug = new Monster();
	    }
	    if (enemyChoice == 1) {
		smaug = new Dragon();
	    }
	    if (enemyChoice == 2) {
		smaug = new Skeleton();
	    }
	    if (enemyChoice == 3) {
		smaug = new Zombie();
	    }
	    if (enemyChoice == 4) {
		smaug = new Vampire();
	    }
	    else {
		smaug = new Werewolf();
	    }
	   
	    
	    System.out.println( "\nOh, yonder " + smaug.getName() + " approacheth!" );


	    
	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		if (pat.miss()) {
		    if ( i == 2 ){
			pat.specialize();}
		    else{
			pat.normalize();}
		d1 = pat.attack( smaug );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");
		    }
		else {System.out.println( "\nRats, " + pat.getName() + " missed!");}
		if (smaug.miss()) {

		d2 = smaug.attack( pat );    
		System.out.println( "\n" + "Ye Olde " + smaug.getName() + " smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");}
		else {System.out.println( "Lucky! Ye Olde " + smaug.getName() + " missed its attack!");
		}
		
	     

					  
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde " + smaug.getName() + " down, but " +
				    "with its dying breath ye olde " + smaug.getName() + ". " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde " + smaug.getName() + " hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

        
	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}
        

	System.out.println( "Thy game doth be over.");
    }//end main

}//end class YoRPG


