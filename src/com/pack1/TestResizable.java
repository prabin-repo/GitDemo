package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(resizable, 500, 500).perform();

	}

}
