package mockitoExample;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;


class DiceControllerTest {

	DiceController objToTest;
	
	@BeforeEach
	void setUp() throws Exception {
		objToTest = DiceController.getInstance();
	}


	@Test
	void test() {
		
		// Mock the Dice objects
		Dice mockDie1 = Mockito.mock(Dice.class);
		Dice mockDie2 = Mockito.mock(Dice.class);
		
		// set the Dice objects in the object being tested
		Mockito.doReturn(1).when(mockDie1).roll();
		Mockito.doReturn(1).when(mockDie2).roll();
		
		objToTest.setDiceObj(mockDie1, 0);
		objToTest.setDiceObj(mockDie2, 1);
		
		// Output of the DiceController is now predictable
		assertEquals("2: ************************************\n3: \n4: \n5: \n6: \n7: \n8: \n9: \n10: \n11: \n12: \n",objToTest.showDistribution());
		Mockito.verify(mockDie1, Mockito.times(36)).roll();
		Mockito.verify(mockDie2, Mockito.times(36)).roll();
		
	}
 
}
