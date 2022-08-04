package com.sgtesting.xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteXPathDemo();
		//relativeXPathUsingTagName();
		//relativeXPathUsingTagNameWithIndex();
		//relativeXPathUsingTagNameWithAttributeNameValue();
		//relativeXPathUsingAttributeNameValue();
		//relativeXPathUsingAttributeValueAlone();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValue();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOrOperator();
		//relativeXPathUsingPartialAttributeValue();
		//relativeXPathUsingTagNameWithAttributeName();
		//relativeXPathUsingTagNameWithAttributeName_1();
		//relativeXPathUsingTagNameWithAttributeName_2();
		//relativeXPathUsingTagNameWithAttributeName_3();
		//relativeXPathUsingTagNameWithTextContent();
		relativeXPathUsingTagNameWithPartialTextContent();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("D:\\HTML\\Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("ChaitraTN");
	}
	/*case1 : Identify the element based on Tagname alone*/
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("ChaitraTN");
	}
	/*case2 : Identify the element based on Tagname with index*/
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("1234567");
	}
	/*case3 : Identify the element based on Tagname with attribute name and value combination*/
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("1234567");
	}
	/*case4 : Identify the element based on attribute name and value combination*/
	private static void relativeXPathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	/*case5 : Identify the element based on attribute name value alone*/
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	/*case6 : Identify the element based on Multiple attribute name value combination*/
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@name='submit1btn1']")).click();
	}
	/*case7 : Identify the element based on Tag name with Multiple attribute name and value combination using and operator*/
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'and @name='submit1btn1']")).click();
	}
	/*case8 : Identify the element based on Tag name with Multiple attribute name and value combination using or operator*/
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'or @name='submit1btn1']")).click();
	}
	/*case9 : Identify the element based on TagName with attribute name and partial value combination*/
	private static void relativeXPathUsingPartialAttributeValue()
	{
		//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	/*case10 : Identify the element based on Tagname with attribute name*/
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links are :"+olinks.size());
	}
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			System.out.println(link.getText());
		}
	}
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				if(link.getText().endsWith("Testing"))
				{
					link.click();
					Thread.sleep(4000);
					break;
				}
			}
			//oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void relativeXPathUsingTagNameWithAttributeName_3()
	{
		/*org.openqa.selenium.StaleElementReferenceException: stale element reference:
		 element is not attached to the page document */
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				if(link.getText().endsWith("Testing"))
				{
					link.click();
					//Thread.sleep(4000);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/* case11 : Identify the element based on Tag Name with Text content */
	private static void relativeXPathUsingTagNameWithTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	/* case12 : Identify the element based on Tag Name with Partial Text content */
	private static void relativeXPathUsingTagNameWithPartialTextContent()
	{
		//oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI Apache']")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'ware')]")).click();
	}
}
