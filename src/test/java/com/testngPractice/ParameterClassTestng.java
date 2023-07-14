package com.testngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.GlobalFunctions.GenericFunctions;

public class ParameterClassTestng extends GenericFunctions{

	@Test
	@Parameters({ "browser", "url" })
	public void login(String browsername,String url) {

		System.out.println("Login function");

		launchBrowser(browsername);
		launchApplication(url);
		
	}

	@Test
	public void logout() {
		System.out.println("Logout method");
	}

}
