public class Monster extends Character{
    
    
    //Constructor
    public Monster() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Monster";
    }

}
