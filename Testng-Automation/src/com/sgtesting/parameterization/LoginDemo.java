package com.sgtesting.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo {
	@Test(dataProvider="getCredentials")
	public void login(String user,String pwd)
	{
		System.out.println(user+" "+pwd);
	}
	@DataProvider
	public Object[][] getCredentials() 
	{
		return new Object[][]	{{"DemoUser1","Welcome1"},
		{"DemoUser2","Welcome2"},{"DemoUser3","Welcome3"}};
	}
}

