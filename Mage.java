public class Mage extends Character {


    //Constructors
    public Mage() {
	HP = 75;
	strength = 50;
	defense = 20;
	atkrat = 5;
    }
    public Mage(String x) {
	this();
	name = x;
    }

    //Methods
    public String toString() {
	return "Mage";
    }
}
