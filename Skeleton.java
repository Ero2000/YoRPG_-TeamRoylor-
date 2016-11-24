public class Skeleton extends Character{
    
    
    //Constructor
    public Skeleton() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Skeleton";
    }

    public void specialize() {

    }
    public void normalize() {

    }
    public String about () {
	return "Skeleton: Grr..";
    }
}
