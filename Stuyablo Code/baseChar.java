import java.util.Random;

public class baseChar {
    
    private String name;
    private int Health;
    private int Strength;
    private int Precision;

    public void setName(String newName) {
	name = newName;
    }
    public String toString() {
	return name;
    }
    public void setHealth(int newHP){
	Health = newHP;
    }
    public void setStrength(int newStrength){
	Strength = newStrength;
    }
    public void setPrecision(int newPrecision){
	Precision = newPrecision;
    }
    public int getHealth(){
	return Health;
    }
    public int getStrength(){
	return Strength;
    }
    public int getPrecision(){
	return Precision;
    }

    public String attack(baseChar other) {
	other.Health-=Strength;
	return (this + " attacks "+ other);
    }
}
