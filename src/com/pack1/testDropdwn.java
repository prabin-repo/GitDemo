package com.pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testDropdwn {

	public static <Webelemnt> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("country")).sendKeys("Algeria");
		WebElement dropdwn=driver.findElement(By.id("searchLanguage"));
		
		Select select=new Select(dropdwn);
		select.selectByValue("bg");
		
	List<WebElement> values= driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(7).getText());
		
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for(WebElement link: links) {
			 System.out.println(link.getText()+"Link is"+link.getAttribute("href"));
			 
			 
			 
		 }
		 
		
		System.out.println(driver.getTitle());
	
	}

}
