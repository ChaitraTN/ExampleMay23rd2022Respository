package com.sgtesting.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	@Parameters(value="user")
	@Test
	public void createUser(String user)
	{
		System.out.println("The User "+user+" has created successfull");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("The User DemoUser1 has modified successfully");
	}
}
