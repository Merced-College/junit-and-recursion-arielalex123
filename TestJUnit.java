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
	
	@Test
	public void testStringClean_1() {
		assertEquals("yza", TestingRecursion.stringClean("yyyzzza"));
	}
	
	@Test
	public void testStringClean_2() {
		assertEquals("abcd", TestingRecursion.stringClean("abbbbbcccddd"));
	}
	
	@Test
	public void testStringClean_3() {
		assertEquals("Helo", TestingRecursion.stringClean("Hellooo"));
	}
	
	@Test
	public void testStringClean_4() {
		assertEquals("world", TestingRecursion.stringClean("wwwoorlldd"));
	}
	
	@Test
	public void testStringClean_5() {
		assertEquals("nameIsJv", TestingRecursion.stringClean("naaammeeIIsssJvv"));
	}
	
	@Test
	public void testCountHi_1() {
		assertEquals(1, TestingRecursion.countHi("xxhixx"));
	}
	
	@Test
	public void testCountHi_2() {
		assertEquals(2, TestingRecursion.countHi("xhixhix"));
	}
	
	@Test
	public void testCountHi_3() {
		assertEquals(1, TestingRecursion.countHi("hi"));
	}
	
	@Test
	public void testCountHi_4() {
		assertEquals(3, TestingRecursion.countHi("sdhiasdhiasdhi"));
	}
	
	@Test
	public void testCountHi_5() {
		assertEquals(0, TestingRecursion.countHi("helloWorld"));
	}
	
	@Test
	public void testCountHi2_1() {
		assertEquals(1, TestingRecursion.countHi2("ahixhi"));
	}
	
	@Test
	public void testCountHi2_2() {
		assertEquals(2, TestingRecursion.countHi2("ahibhi"));
	}
	
	@Test
	public void testCountHi2_3() {
		assertEquals(0, TestingRecursion.countHi2("xhixhi"));
	}
	
	@Test
	public void testCountHi2_4() {
		assertEquals(3, TestingRecursion.countHi2("ahisawhishixhi"));
	}
	
	@Test
	public void testCountHi2_5() {
		assertEquals(2, TestingRecursion.countHi2("hisdaxhiaxrxielxhishi"));
	}

}
