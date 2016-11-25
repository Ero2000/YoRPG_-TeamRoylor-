public class Archer extends Character {
    
    //Constructors
    public Archer() {
	HP = 100;
	strength = 75;
	defense = 35;
	atkrat = .75;
    }
    public Archer(String x) {
	this();
	name = x;
    }

    //Methods
    public String toString() {
	return "Archer";
    }
    public void specialize() {
	defense -= (int)(Math.random() * 10);
	strength += (int)(Math.random() * 10);
    }
    public void normalize() {
	defense = 35;
	strength = 75;
    }
    public String about () {
	return "Long ranged, uses a bow to shoot enemies from afar.";
    }
}
