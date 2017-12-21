import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		assertEquals(1, FirstMissingPositive.firstMissingPositive(new int[] {}));
		assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[] { 1 }));
		assertEquals(1, FirstMissingPositive.firstMissingPositive(new int[] { 0, 0 }));
		assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[] { 1, 2 }));
		assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[] { 0, 1, 2 }));
		assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[] { 1, 1, 1 }));
		assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[] { 1, 0, 2 }));
		assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[] { 0, 0, -1, 1 }));
		assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[] { 50, 9, 2, 1 }));
		assertEquals(4, FirstMissingPositive.firstMissingPositive(new int[] { 5, 3, 2, 1 }));
		assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
	}

}
