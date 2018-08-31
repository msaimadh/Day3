package com.capgemini.television.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelivisionTest {
Television television;

@BeforeEach
void setUp() {
	television = new Television(true, 50, 514);
}

@AfterEach
void tearDown() {
	television = null;
}

@Test
void testIncreaseVolume() {
	assertEquals(51, television.increaseVolume());
}

@Test
void testDecreaseVolume() {
	assertEquals(49, television.decreaseVolume());
}

@Test
void testChangeChannel() {
	assertEquals(543, television.changeChannel(543));
}

@Test
void testChangeState() {
	assertEquals(false, television.changeState());
}

}
