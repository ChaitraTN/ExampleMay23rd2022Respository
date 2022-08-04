package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueDemo {
		@Test(enabled=false)
		public void assertTrueDemo1()
		{
			try
			{
				SoftAssert obj= new SoftAssert();
				int num1=25;
				int num2=45;
				obj.assertTrue(num1<=num2);
				System.out.println("It is after execution of assertTrue Method...");
				obj.assertAll();
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
				SoftAssert obj= new SoftAssert();
				int num1=25;
				int num2=45;
				Assert.assertFalse(num1>=num2);
				System.out.println("It is after execution of assertFalse Method...");
				obj.assertAll();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			

		}

