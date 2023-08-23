package com.raghib.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {
	// TODO Program Pending to implement.
	public static String url = "https://www.album.alexflueras.ro/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get(url);

		WebElement scrollRight = driver.findElement(By.id("a22"));
		WebElement scrollLeft = driver.findElement(By.id("a1"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scroll Right
		js.executeScript("arguments[0].scrollIntoView()",scrollRight);
		Thread.sleep(5000);
		
		//Scroll Left
		js.executeScript("arguments[0].scrollIntoView()",scrollLeft);
		Thread.sleep(5000);

		driver.quit();
	}

}
