package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("prabin.beh7@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		driver.findElement(By.name("password")).sendKeys("asdfgrh");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]/div")).getText());

	}

}
