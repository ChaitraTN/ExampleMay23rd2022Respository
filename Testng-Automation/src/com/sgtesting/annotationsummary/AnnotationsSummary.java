package com.sgtesting.annotationsummary;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationsSummary {
	@Test
	public void test1_Annotations()
	{
		System.out.println("This is @Test Annotation one");
	}
	@Test
	public void test2_Annotations()
	{
		System.out.println("This is @Test Annotation two");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is @BeforeMethod Annotation");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is @AfterMethod Annotation");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is @BeforeClass Annotation");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is @AfterClass Annotation");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is @BeforeTest Annotation");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is @AfterTest Annotation");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is @BeforeSuite Annotation");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is @AfterSuite Annotation");
	}
}
