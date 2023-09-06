package com.raghib.javascriptexecutor;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=McX3fS5Q_Yc
 * 
 * Previously (Selenium-3) - JavaScriptExecutor -> for scroll.
 * 
 * Now (Selenium-4.2) - Action Class -> scrollByAmount()
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

public class ScrollVertically extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	public static String url = "https://www.amazon.in/";

	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4500)");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']")).click();
		Thread.sleep(5000);

		BaseClass.quitDriver();
	}
}
