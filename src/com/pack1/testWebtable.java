package com.pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWebtable {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> rowNum=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
		
		System.out.println("Number of rows are" +rowNum.size());
	
List<WebElement> colNum=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td"));
		
		System.out.println("Number of col are" +colNum.size());
		
		for(int row=1;row<=rowNum.size()-1;row++) {
			
			for(int col=1;col<=colNum.size()-1;col++){
				
			System.out.print(driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+row+"]/td["+col+"]")).getText());
			}
			System.out.println();
			
			
				
			}
		}
		
		
		
	}

