package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.logiq.Capitalize;

class CapitalizeTest {

	private Capitalize cp;
	@BeforeEach
	void setUp() throws Exception {
		cp = new Capitalize();
	}

	@Test
	void testHandle() {
		String s1 = "hello world   hei";
		String s2 = "Hello World   Hei";
		String s3 = cp.handle(s1);
		assertEquals(s2, s3);
	}

}
