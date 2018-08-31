package com.capgemini.prog.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.prog.Circle;

class AreaOfCircle {

	@Test
			void testCircel() {
			assertEquals(78.5,Circle.area(5),0.1);
			assertEquals(31.5,Circle.perimeter(5),0.1);
			assertEquals(20601.54,Circle.area(81),0.1);
			assertEquals(508.68,Circle.perimeter(81),0.1);
			}
}
