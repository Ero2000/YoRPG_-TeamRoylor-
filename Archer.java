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
}
