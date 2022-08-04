package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
@Test(enabled=false)
	public void assertEqualsDemo1()
	{
		String expected,actual;
		try
		{
			expected=new String("Programming");
			actual="Programming";
			Assert.assertEquals(expected, actual);
			System.out.println("It is after execution of assertEquals Method");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void assertNotEqualsDemo1()
	{
		String expected,actual;
		try
		{
			expected=new String("Programming");
			actual="ProgrammingNew";
			Assert.assertNotEquals(expected, actual);
			System.out.println("It is after execution of assertNotEquals Method");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
