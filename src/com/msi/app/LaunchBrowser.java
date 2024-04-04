package com.msi.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	
	public void openCrome() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//div[@class='Xb9hP']/input[@type='email']")).sendKeys("w.meeta@gmail.com");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}
	
	
	/*public void openSafari() {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
	}*/
	
	
}
