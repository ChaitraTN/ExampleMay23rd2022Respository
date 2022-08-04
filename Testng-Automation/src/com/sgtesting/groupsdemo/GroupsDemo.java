package com.sgtesting.groupsdemo;

import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups="smoke")
	public void method1()
	{
		System.out.println("It is Method1 smoke Testcase Statement");
	}
	@Test(groups="regression")
	public void method2()
	{
		System.out.println("It is Method2 Regression Testcase Statement");
	}
	@Test(groups="smoke")
	public void method3()
	{
		System.out.println("It is Method3 smoke Testcase Statement");
	}
	@Test(groups="regression")
	public void method4()
	{
		System.out.println("It is Method4 Regression Testcase Statement");
	}
	@Test(groups="smoke")
	public void method5()
	{
		System.out.println("It is Method5 smoke Testcase Statement");
	}
	@Test(groups="regression")
	public void method6()
	{
		System.out.println("It is Method6 Regression Testcase Statement");
	}
}
