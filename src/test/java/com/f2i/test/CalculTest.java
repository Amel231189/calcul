package com.f2i.test;

import org.junit.Assert;
import org.junit.Test;

import com.f2i.Calculator;

public class CalculTest {

	Calculator c = new Calculator();

	@Test
	public void addtest() {
		
		Assert.assertEquals(5,c.add(2, 3));

	}

	@Test
	public void multiptest() {
		
		Assert.assertEquals(6,c.multiply(2, 3));

	}
}
