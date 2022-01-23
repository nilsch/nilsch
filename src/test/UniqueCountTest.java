package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.logiq.UniqueCount;

class UniqueCountTest {

	private UniqueCount uc;
	@BeforeEach
	void setUp() throws Exception {
		uc = new UniqueCount();
	}

	@Test
	void testHandle() {

		var numberOfUniques = Integer.parseInt(uc.handle("Hello"));
		assertEquals(3, numberOfUniques);
		
		
		numberOfUniques = Integer.parseInt(uc.handle("Hello world"));
		assertEquals(5, numberOfUniques);
		
		
	}

}
