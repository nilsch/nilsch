package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.logiq.Palindrome;

class PalindromeTest {

	private Palindrome pa;
	@BeforeEach
	void setUp() throws Exception {
		pa = new Palindrome();
	}

	@Test
	void testHandle() {
		
		String str = "alexela";
		var isPalidrom = Boolean.parseBoolean(pa.handle(str));
		assertTrue(isPalidrom);
		
		String str2 = "alexxela";
		isPalidrom = Boolean.parseBoolean(pa.handle(str2));
		assertTrue(isPalidrom);
		
		String str3 = "logiq";
		isPalidrom = Boolean.parseBoolean(pa.handle(str3));
		assertFalse(false);
		
	}

}
