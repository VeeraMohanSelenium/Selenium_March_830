package com.testngPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PriorityClass {

	@Test()
	public void test() {

		System.out.println("I am test method");
		//assertEquals(true, false);
		assertEquals("HCM", "TCM");
	}

	@Test(dependsOnMethods = "test")
	public void camera() {
		System.out.println("I am camera method");
	}

	@Test()
	public void dog() {
		System.out.println("I am dog method");
	}

}
