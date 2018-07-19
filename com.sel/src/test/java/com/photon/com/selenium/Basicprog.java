package com.photon.com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicprog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\FFFdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Books");
		driver.findElement(By.name("btnK")).click();
		driver.manage().window().maximize();
		driver.close();


}
	}
