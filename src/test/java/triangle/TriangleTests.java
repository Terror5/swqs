package triangle;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTests {
	

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testScalene() {
		assertEquals(TriangleType.SCALENE, Triangle_Dummy.classify(1, 2, 3));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(TriangleType.EQUILATERAL, Triangle_Dummy.classify(10, 10, 10));
	}

	@Test
	public void testIsoscalesAB() {
		assertEquals(TriangleType.ISOSCALES, Triangle_Dummy.classify(2, 2, 1));
	}
	
	@Test
	public void testIsoscalesAC() {
		assertEquals(TriangleType.ISOSCALES, Triangle_Dummy.classify(2, 1, 2));
	}
	
	@Test
	public void testIsoscalesBC() {
		assertEquals(TriangleType.ISOSCALES, Triangle_Dummy.classify(1, 2, 2));
	}

	@After
	public void tearDown() throws Exception {
	}

}
