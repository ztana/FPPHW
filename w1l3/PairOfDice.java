package w1l3;

/**
 * 
 * result
 * 
First pair come up to 6
Second pair come up to 9
First pair come up to 7
Second pair come up to 11
First pair come up to 9
Second pair come up to 4
First pair come up to 10
Second pair come up to 10
It took 4 times.

 */
import java.util.Random;

public class PairOfDice {

	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		roll();
	}

	public void roll() {
		// Roll the dice by setting each of the dice (die1, die2) to be
		// a random number between 1 and 6.
		Random r = new Random();
		//1~6---0-inclusive 6-exclusive
		die1 = r.nextInt(6) + 1;

		die2 = r.nextInt(6) + 1;

	}




	public static void main(String[] args) {
		
		// Create two object for the PairOfDice
		PairOfDice p1 = new PairOfDice();
		PairOfDice p2 = new PairOfDice(1,2);

		// Roll the two pairs of dice for both objects until the totals are same.
		int count = 0;
		do{
			p1.roll();
			p2.roll();
			System.out.println("First pair come up to "+ (p1.die1+p1.die2));
			System.out.println("Second pair come up to "+ (p2.die1+p2.die2));
			count++;
		}while((p1.die1+p1.die2) != (p2.die1+p2.die2));
		
	
        // Display how many times needed to get the same total
		System.out.println("It took "+ count+" times.");
	}


}
