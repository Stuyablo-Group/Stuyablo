import java.util.Scanner;

public class Stuyablo {
    public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name = user_input.next();
	Warrior w1 = new Warrior(name);
	Mob xeno = new Mob();
	while (true) {
	    System.out.print("Enter a move: ");
	    String input = user_input.next();
	    while (!input.equals("attack")) {
		System.out.println("This is an invalid move. Enter another move");
		input = user_input.next();
	    }
	    System.out.println(w1.attack(xeno));
	    System.out.println("Xeno health: " + xeno.getHealth());
	    if (xeno.getHealth() <= 0) {
		System.out.println("You Win!");
		break;
	    }
	    System.out.println(xeno.attack(w1));
	    System.out.println("Your health: " + w1.getHealth());
	    if (w1.getHealth() <= 0) {
		System.out.println("You Lose :(");
		break;
	    }
	}
    
    }
}
