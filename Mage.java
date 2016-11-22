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

    public void specialize() {
	defense -= (int)(Math.random() * 10);
	strength += (int)(Math.random() * 10);
    }
    public void normalize() {
	defense = 20;
	strength = 50;
    }
    public String about () {
	return "Mage: Uses magical attacks to smite enemies.";
    }
}
