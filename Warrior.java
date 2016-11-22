public class Warrior extends Character{

    //Constructors
    public Warrior() {
	HP = 125;
	strength = 100;
	defense = 40;
	atkrat = 0.4;
    }
    public Warrior(String x) {
	this();
	name = x;
    }

    //Methods
    public String toString() {
	return "Warrior";
    }

    
}
