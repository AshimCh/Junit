package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MymathTest {

	@Test
	public void sumofnumbers() {
		Mymath mymath = new Mymath();
		int result = mymath.sum(new int[] {1,2,3});
		assertEquals(6, result);
		System.out.println(result);
	}
	

}
