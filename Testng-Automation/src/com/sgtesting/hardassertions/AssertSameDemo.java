package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {
@Test(enabled=false)
public void assertSameDemo1()
{
	String expected,actual;
	try
	{
		expected=new String("Programming");
		actual="Programming";
		Assert.assertSame(expected, actual);
		System.out.println("It is after execution of assert Same Method...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test
public void assertNotSameDemo1()
{
	String expected,actual;
	try
	{
		expected=new String("Programming");
		actual="ProgrammingNew";
		Assert.assertNotSame(expected, actual);
		System.out.println("It is after execution of assertNotSame Method...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
