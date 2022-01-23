package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.logiq.Whitespace;

class WhitespaceTest {

	private Whitespace ws;
	@BeforeEach
	void setUp() throws Exception {
		ws = new Whitespace();
	}
	
	@Test
	void testHandle() {
		var s1 = "Not yet implemented";
		var s2 = "Notyetimplemented";
		var s3 = ws.handle(s1);
		assertEquals(s2, s3);
		
	}
}
