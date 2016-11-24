public class Zombie extends Character{
    
    
    //Constructor
    public Zombie() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Zombie";
    }

    public void specialize() {

    }
    public void normalize() {

    }
    public String about () {
	return "Zombie: Grr..";
    }
}
