import java.util.Scanner;

public class Stuyablo {
    public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name = user_input.next();
	Warrior w1 = new Warrior(name);
	Warrior w2 = new Warrior("Mob");

	System.out.println(w1.attack(w2));

	System.out.println(w2.getHealth());
    
    }
}
