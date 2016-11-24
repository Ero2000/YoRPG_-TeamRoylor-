public class Dragon extends Character{
    
    
    //Constructor
    public Dragon() {
	HP = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	atkrat = 1;

    }

    //Methods
    public String getName() {
	return "Dragon";
    }

    public void specialize() {

    }
    public void normalize() {

    }
    public String about () {
	return "Dragon: Grr..";
    }
}
