package com.surawase.SeleniumprojectBeginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumBrowserLaunch {
	 public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid"
				+ ".return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_"
				+ "signin&openid.identity=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid"
				+ ".mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0%2Fidentifier"
				+ "_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'ap_email')]")).sendKeys("sushen.surawase@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("sushen@3984");
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'nav-a  ')][1]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'hm-icon-label')]")).click();
		//driver.findElement(By.xpath(""))
		System.out.println(driver.getTitle());
		System.out.println("Test is successful");
		//driver.close();

	}

}
