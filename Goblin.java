public class Goblin extends Character {


    //Constructors
    public Goblin() {
	HP = 100;
	strength = 100;
	defense = 10;
	atkrat = .5;
    }
    public Goblin(String x) {
	this();
	name = x;
    }

    //Methods
    public String toString() {
	return "Goblin";
    }

    public void specialize() {
	defense -= (int)(Math.random() * 10);
	strength += (int)(Math.random() * 10);
    }
    public void normalize() {
	defense = 10;
	strength = 100;
    }
    public String about () {
	return "That guy.";
    }

}
