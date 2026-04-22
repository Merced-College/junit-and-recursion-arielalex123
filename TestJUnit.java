import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJUnit {

	@Test
	public void testCount8_1() {
		assertEquals(6, TestingRecursion.count8(88188));
	}
	
	@Test
	public void testCount8_2() {
		assertEquals(4, TestingRecursion.count8(8818));
	}
	
	@Test
	public void testCount8_3() {
		assertEquals(0, TestingRecursion.count8(0));
	}
	
	@Test
	public void testCount8_4() {
		assertEquals(5, TestingRecursion.count8(888));
	}
	
	@Test
	public void testCount8_5() {
		assertEquals(0, TestingRecursion.count8(90999));
	}
	
	@Test
	public void testStrCount_1() {
		assertEquals(2, TestingRecursion.strCount("catcowcat", "cat"));
	}
	
	@Test
	public void testStrCount_2() {
		assertEquals(1, TestingRecursion.strCount("catcowcat", "cow"));
	}
	
	@Test
	public void testStrCount_3() {
		assertEquals(0, TestingRecursion.strCount("catcowcat", "dog"));
	}
	
	@Test
	public void testStrCount_4() {
		assertEquals(3, TestingRecursion.strCount("catcatcowcat", "cat"));
	}
	
	@Test
	public void testStrCount_5() {
		assertEquals(2, TestingRecursion.strCount("catdogcowcatdog", "dog"));
	}
	
	

}
