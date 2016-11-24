public class Werewolf extends Character{
    
    
    //Constructor
    public Werewolf() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Werewolf";
    }

    public void specialize() {

    }
    public void normalize() {

    }
    public String about () {
	return "Werewolf: Grr..";
    }
}
