package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
@Test(enabled=false)
public void assertTrueDemo1()
{
	try
	{
		int num1=25;
		int num2=45;
		Assert.assertTrue(num1<=num2);
		System.out.println("It is after execution of assertTrue Method...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test
public void assertFalseDemo1()
{
	try
	{
		int num1=25;
		int num2=45;
		Assert.assertFalse(num1>=num2);
		System.out.println("It is after execution of assertFalse Method...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	

}
