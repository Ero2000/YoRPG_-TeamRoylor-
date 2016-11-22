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

    public void specialize() {
	defense -= (int)(Math.random() * 10);
	strength += (int)(Math.random() * 10);
    }
    public void normalize() {
	defense = 40;
	strength = 100;
    }
    public String about () {
	return "Warrior: Tough and strong. A classic.";
    }

    
}
