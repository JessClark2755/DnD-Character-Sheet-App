import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiceRollerTest {

	@Test
	public void getRoll() {
		DiceRoller dice;
		int size;
		int roll;
		dice = DiceRoller.createInstance();
		
		//test 10 times
		for (int i = 0; i < 10; i++) {
			size = 4;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-4
			
			size = 6;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-6
			
			size = 8;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-8
		
			size = 10;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-10
		
			size = 12;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-12
		
			size = 20;
			roll = dice.getRoll(size);
			assertTrue(roll > 0 && roll < size + 1);  //roll must be in range of 1-20
		}
		//testing create instance singleton class
		dice = DiceRoller.createInstance();
	}
}