package com.testngPractice;

import org.testng.annotations.Test;

public class GroupingClass {
	
	@Test(groups = "smokeTest")
	public void tc_01() {
		
		System.out.println("tc_01");
	}
	@Test
	public void tc_02() {
		
		System.out.println("tc_02");
	}
	@Test(groups = "smokeTest")
	public void tc_03() {
		
		System.out.println("tc_03");
	}
	@Test
	public void tc_04() {
		
		System.out.println("tc_04");
	}
	@Test(groups = "smokeTest")
	public void tc_05() {
		
		System.out.println("tc_05");
	}
	@Test
	public void tc_06() {
		
		System.out.println("tc_06");
	}
	@Test(groups = "smokeTest")
	public void tc_07() {
		
		System.out.println("tc_07");
	}

}
