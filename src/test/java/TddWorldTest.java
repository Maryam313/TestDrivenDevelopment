import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.BooleanSupplier;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
class TddWorldTest {

	/**
	 * Test method for {@link TddWorld#subtract(int, int)}.
	 */
	@Test
	@DisplayName("Sub two positive int ")
	void testSubtract() {
		TddWorld tdd = new TddWorld();
		// fail("Not yet implemented");
		// tdd.subtract(5, 3);
		assertEquals(2, tdd.subtract(5, 3));
		assertEquals(-2, tdd.subtract(3, 5));

	}

	@Test
	@DisplayName("Sub two negative int ")
	void testNegativeSubtract() {
		TddWorld tdd = new TddWorld();
		// fail("Not yet implemented");
		// tdd.subtract(5, 3);
		assertEquals(0, tdd.subtract(-1, -1));
	}

	@Test
	@DisplayName("Sub two random int ")
	void testRandomSubtract() {
		TddWorld tdd = new TddWorld();
		assertEquals(27, tdd.subtract(15, -12));

	}

	@Test
	@DisplayName("Fetched data from API in the form of HashMap.. ")
	void testGetData() {
		TddWorld tdd = new TddWorld();
		assertNotNull(tdd.getData());
		assertEquals(true, tdd.getData().containsKey("status"));
		assertEquals(true, tdd.getData().containsKey("data"));

	}

	@Test
	@DisplayName("Test odd and even num ")
	public void testEvenOrOdd() {
		int[] input = { 2, 3, 7, 6, 9, 4, 5, 7 };
		TddWorld tdd = new TddWorld();
		HashMap<String, ArrayList<Integer>> expectedOutput = new HashMap<>();
		expectedOutput.put("even:", new ArrayList<>(Arrays.asList(2, 6, 4)));
		expectedOutput.put("odd:", new ArrayList<>(Arrays.asList(3, 7, 9, 5, 7)));
		assertEquals(expectedOutput, tdd.evenOrOdd(input));
	}

	@Test
	@DisplayName("Test odd num ")
	public void testOdd() {
		int[] input = { 3, 7, 9, 5, 7 };
		TddWorld tdd = new TddWorld();
		HashMap<String, ArrayList<Integer>> expectedOutput = new HashMap<>();
		expectedOutput.put("odd:", new ArrayList<>(Arrays.asList(3, 7, 9, 5, 7)));
		expectedOutput.put("even:", new ArrayList<Integer>());
		assertEquals(expectedOutput, tdd.evenOrOdd(input));
	}

	@Test
	@DisplayName("Test Null ")
	public void testNull() {
		TddWorld tdd = new TddWorld();
		int[] input = null;
		assertThrows(NullPointerException.class, () -> tdd.evenOrOdd(input));
		assertThrows(NullPointerException.class, () -> tdd.evenOrOdd(input));
	}

	@Test
	@DisplayName("Test even num ")
	public void testEven() {
		int[] input = { 2, 6, 4 };
		TddWorld tdd = new TddWorld();
		HashMap<String, ArrayList<Integer>> expectedOutput = new HashMap<>();
		expectedOutput.put("odd:", new ArrayList<Integer>());
		expectedOutput.put("even:", new ArrayList<>(Arrays.asList(2, 6, 4)));
		assertEquals(expectedOutput, tdd.evenOrOdd(input));
	}

	@Test
	@DisplayName("Test Zero power ")
	public void testZeroPower() {
		TddWorld tdd = new TddWorld();
		assertEquals(0, tdd.calculatePower(0, 0));

	}

	@Test
	@DisplayName("Test power base:2 expo:3 ")
	public void testIntPower() {
		TddWorld tdd = new TddWorld();
		assertEquals(8, tdd.calculatePower(2, 3));
	}

	@Test
	@DisplayName("Test Null power ")
	public void testPowerNull() {
		TddWorld tdd = new TddWorld();
		Integer base = null;
		Integer exponent = null;
		assertThrows(NullPointerException.class, () -> tdd.calculatePower(base, exponent));
		assertThrows(NullPointerException.class, () -> tdd.calculatePower(base, exponent));
	}

	@Test
	@DisplayName("Test Reverse String.. ")
	public void testReverse1() {
		TddWorld tdd = new TddWorld();
		assertEquals("olleh", tdd.reverse("hello"));
	}

	@Test
	@DisplayName("Test Null Reverse String.. ")
	public void testReverse2() {
		TddWorld tdd = new TddWorld();
		assertEquals(null, tdd.reverse(null));
	}

	@Test
	@DisplayName("Test single character.. ")
	public void testReverse3() {
		TddWorld tdd = new TddWorld();
		assertEquals("k", tdd.reverse("k"));
		assertEquals("", tdd.reverse(""));

	}
}
