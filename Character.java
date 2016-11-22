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
    public void specialize() {
	defense -= 10;
	strength += 10;
    }
    public void normalize() {
	defense += 10;
	strength -= 10;
    }
    public static String about () {
	return "\t1: Warrior: A melee fighter, tough and strong.\n" + "\t2: Mage: Uses magic, though range isn't that long.\n" + "\t3: Rogue: Silent and swift, with quick hits.\n" + "\t4: Archer: Shoots from afar, faster than spit.\n" + "\t5: Goblin: With this fella, it's about to get lit.\n";	
    }

    public String getName() {
	return name;
    }

}
