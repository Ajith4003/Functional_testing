package com.Automation.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript  implements Properties{

	public static void main(String[] args) throws InterruptedException,IOException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(time);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(time);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(time);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(time);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(time);
		driver.findElement(By.xpath("//h3[@class=' MuiBox-root css-psy1y7']")).click();
		Thread.sleep(time);
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(time);

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(location); 
		Thread.sleep(time);
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		Thread.sleep(time);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(time);
		
		//popup handling
		Alert a = driver.switchTo().alert();
		a.accept();
		
		//screenshort
		Screenshort.caputecher(driver,"image.jpeg");  

		System.out.println("process complected");

		driver.quit();






	}

}
