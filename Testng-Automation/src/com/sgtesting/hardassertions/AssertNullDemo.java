package com.sgtesting.hardassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
@Test(enabled=false)
public void assertNullDemo1()
{
	try
	{
		File f1=null;
		Assert.assertNull(f1);
		System.out.println("It is after execution of assertNull Method");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test
public void assertNotNullDemo1()
{
	try
	{
		File f1=null;
		f1=new File("E:\\");
		Assert.assertNotNull(f1);
		System.out.println("It is after execution of assertNotNull Method");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
