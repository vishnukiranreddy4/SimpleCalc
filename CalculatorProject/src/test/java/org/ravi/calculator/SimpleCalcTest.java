package org.ravi.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalcTest {
	
	SimpleCalc simpleCalc;

	@Before
	public void setUp() throws Exception {
		simpleCalc = new  SimpleCalc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateAddition() {
		assertEquals(30, simpleCalc.calculateAddition(10, 20));
	}
	
	@Test
	public void testCalculateSubtraction() {
		assertEquals(30, simpleCalc.calculateSubtraction(50, 20));
	}

}
