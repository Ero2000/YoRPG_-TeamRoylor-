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

}
