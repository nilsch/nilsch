package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.logiq.Reverse;

class ReverseTest {

	private Reverse re;
	@BeforeEach
	void setUp() throws Exception {
		re = new Reverse();
	}

	@Test
	void testHandle() {
		var s1 = "hello";
		var s2 = "olleh";
		var s3 = re.handle(s1);
		assertEquals(s2, s3);
	}

}
