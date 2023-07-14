package com.testngPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am beforeMethod method");
	}

	@Test
	public void testMethod() {
		System.out.println("I am testMethod method");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("I am aftermethod method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am afterClass method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am afterTest method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am afterSuite method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforesuite method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am beforetest method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am beforeClass method");
	}

}
