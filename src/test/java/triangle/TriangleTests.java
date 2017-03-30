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
		assertEquals(TriangleType.SCALENE, Triangle_Dummy.classify(0, 0, 0));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(TriangleType.EQUILATERAL, Triangle_Dummy.classify(0, 0, 0));
	}

	@Test
	public void testIsoscales() {
		assertEquals(TriangleType.ISOSCALES, Triangle_Dummy.classify(0, 0, 0));
	}


	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
