package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.prog.WordRev;

class WordReverseTest {
	void testWordRevTest() {
		assertEquals("olleH ssenkrad ym dlo ,dneirf I evah emoc ot klat ot uoy niaga ",WordRev.reverseString("Hello darkness my old friend, I have come to talk to you again"));
		assertEquals("uhdam ",WordRev.reverseString("madhu"));
	}
}