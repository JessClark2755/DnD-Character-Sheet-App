import java.util.Random;

/*
 *  A class for rolling the different sizes of dice.
 */
public class DiceRoller {
	private static DiceRoller instance;
	private static boolean exists = false;
	private Random die;		
	
	
	private DiceRoller() {
		die = new Random();
		exists = true;
	}
	
	/*
	 *  Returns a random integer number given the 
	 *  die size s
	 */
	public int getRoll(int s) {
		if(s == 4) 
			return die.nextInt(4) + 1; 
		else if (s == 6)
			return die.nextInt(6) + 1;
		else if (s == 8)
			return die.nextInt(8) + 1;
		else if (s == 10)
			return die.nextInt(10) + 1;
		else if (s == 12)
			return die.nextInt(12) + 1;
		else 
			return die.nextInt(20) + 1;
	}
 
	public static DiceRoller createInstance(){
		if(!exists){
			instance = new DiceRoller();
		}
		return instance;
	}
}
