package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.prog.AbsDiff;

class AbsoluteDiffTest {
	@Test
	void testAbsDiff() {
		int arr[] = { 1,2,3,4,5,3,4,3,2,1};
		assertEquals(1,AbsDiff.checkAbsDiff(arr, 3));
		assertEquals(0,AbsDiff.checkAbsDiff(arr, 0));
		assertEquals(1,AbsDiff.checkAbsDiff(arr, 100));

	//	fail("Not yet implemented");
	}

}

