package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	@Test
	public void assertEqualsDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("Programming");
			actual="Programming";
			obj.assertEquals(expected, actual);
			System.out.println("It is after Execution of assertEquals Method");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void assertNotEqualsDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("Programming");
			actual="ProgrammingNew";
			obj.assertEquals(expected, actual);
			System.out.println("It is after Execution of assertNotEquals Method");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
