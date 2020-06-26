package br.com.codenation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatisticUtilTest {

	@Test
	public void testAverage() {
		assertEquals(3, StatisticUtil.average(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testAverage2() {
		assertEquals(3, StatisticUtil.average(new int[] { 5, 4, 2, 1, 3 }));
	}

	@Test
	public void testAverage3() {
		assertEquals(4, StatisticUtil.average(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 1 }));
	}

	@Test
	public void testMode() {
		assertEquals(3, StatisticUtil.mode(new int[] { 1, 2, 3, 3 }));
	}

	@Test
	public void testMode2() {
		assertEquals(3, StatisticUtil.mode(new int[] { 3, 2, 1, 3 }));
	}

	@Test
	public void testMode3() {
		assertEquals(4, StatisticUtil.mode(new int[] { 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 4 }));
	}

	@Test
	public void testMedian() {
		assertEquals(3, StatisticUtil.median(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testMedian2() {
		assertEquals(5, StatisticUtil.median(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
	}

	@Test
	public void testMedian3() {
		assertEquals(8, StatisticUtil.median(new int[] { 1, 4, 6, 10, 12, 14 }));
	}

	@Test
	public void testMedian5() {
		assertEquals(6, StatisticUtil.median(new int[] { -1, 6, 10, 4, 12, 14, 1 }));
	}

	@Test
	public void testMedian6() {
		assertEquals(-1, StatisticUtil.median(new int[] { -6, 10, -4, 12, -14, 1 }));
	}
}
