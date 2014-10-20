public class Warrior extends baseChar {

    private int shieldBlock;
    
    public Warrior(String name) {
	setName(name);
	setHealth(100);
	setStrength(20);
	setPrecision(7);
	shieldBlock = 3;
    }
}
