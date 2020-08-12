package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

	Calculate obj = new Calculate();

	@Test
	public void addTest() {
		Assert.assertNotNull(obj);
		Assert.assertEquals(3, obj.add(1, 2));
	}
	
	@Test
	public void subtractTest() {
		Assert.assertEquals(4, obj.subtract(5, 1));
	}
	
	@Test
	public void multiplyTest() {
		Assert.assertEquals(40, obj.multiply(4, 10));
		
	}
	
	@Test
	public void divideTest() {
		Assert.assertEquals(4, obj.divide(40, 10));
	}
}
