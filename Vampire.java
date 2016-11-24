public class Vampire extends Character{
    
    
    //Constructor
    public Vampire() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Vampire";
    }

    public void specialize() {

    }
    public void normalize() {

    }
    public String about () {
	return "Vampire: Grr..";
    }
}
