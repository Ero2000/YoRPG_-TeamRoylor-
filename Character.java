public abstract class Character {
    protected int HP;
    protected int strength;
    protected int defense;
    protected double atkrat;
    protected String name;
    
    public boolean isAlive() {
	return (HP > 0);
    }
    public int getDefense() {
	return defense;
    }
    public void lowerHP(int x) {
	HP -= x;
    }
    public int attack(Character x) {
	int damage = (int)(strength * atkrat) - x.getDefense();
	if (damage < 0) {damage = 0;}
        x.lowerHP(damage);
	x.normalize();
	return damage;
    }
    public boolean miss() {
	if (Math.random() > 0.3) {return true;}
	else {return false;}
    }
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about ();

    public String getName() {
	return name;
    }

}
