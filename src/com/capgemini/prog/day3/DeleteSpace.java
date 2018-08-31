package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.prog.DeleteSpaceAndWord;

class DeleteSpace {
	class DeleteSpaceTest {

		@Test
		void testDeleteSpaceAndWord() {
			assertEquals("This is a test sentence",DeleteSpaceAndWord.modify("This is  a is test sentence","is",4));
			assertEquals("This program is working",DeleteSpaceAndWord.modify("This is program is    working","is",2));
			assertEquals("1 2 3 4 5 6 7 8",DeleteSpaceAndWord.modify("1 2 3 4 5 6  8 7 8","8",7));
		}
	}
}
