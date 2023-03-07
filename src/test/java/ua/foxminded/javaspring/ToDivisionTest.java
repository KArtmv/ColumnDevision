package ua.foxminded.javaspring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToDivisionTest {
	ToDivision division = new ToDivision();

	@Test
	void toDivisoin_shouldReturnIllegalArgumentException_whenInputDivisorAsZero() {
		assertThrows(IllegalArgumentException.class, () -> division.toDivision(3, 0));
	}

	@Test
	void toDivision_shouldReturnColumnDivisor_inputDividendAndDivisor() {
        String expected =   "_14789│20\n" + 
                " 140  │---\n" + 
                " ---  │739\n" + 
                "  _78\n" + 
                "   60\n" + 
                "   --\n" + 
                "  _189\n" + 
                "   180\n" + 
                "   ---\n" + 
                "     9\n";
		assertEquals(expected, division.toDivision(14789, 20));
	}

	@Test
	void toDivision_shouldReturnColumnDivisor2_inputDividendAndDivisor() {
		String expected =   "_12│3\n" + 
				" 12│-\n" + 
				" --│4\n" + 
				"  0\n";	
		assertEquals(expected, division.toDivision(12, 3));
	}

	@Test
	void toDivision_shouldReturnResultZero_whenInputDivisorHigherThanDividend() {

		assertEquals("3/12=0", division.toDivision(3, 12));
	}
	
}
