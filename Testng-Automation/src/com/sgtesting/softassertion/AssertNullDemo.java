package com.sgtesting.softassertion;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
@Test(enabled=false)
public void assertNullDemo1()
{
	try
	{
		SoftAssert obj=new SoftAssert();
		File f1=null;
		obj.assertNull(f1);
		System.out.println("It is after execution of assertNull Method...");
		obj.assertAll();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void assertNotNullDemo1()
{
	try
	{
		SoftAssert obj=new SoftAssert();
		File f1=null;
		f1=new File("E:\\EXAMPLE");
		obj.assertNotNull(f1);
		System.out.println("It is after execution of assertNotNull Method...");
		obj.assertAll();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
