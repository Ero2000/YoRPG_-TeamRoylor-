public class Rogue extends Character {


    //Constructors
    public Rogue() {
	HP = 100;
	strength = 150;
	defense = 25;
	atkrat = 1;
    }
    public Rogue(String x) {
	this();
	name = x;
    }

    //Methods
    public String toString() {
	return "Rogue";
    }

    public void specialize() {
	defense -= (int)(Math.random() * 10);
	strength += (int)(Math.random() * 10);
    }
    public void normalize() {
	defense = 25;
	strength = 150;
    }
    public String about () {
	return "Rogue: Sneaky, uses quick attacks to assassinate.";
    }

}
