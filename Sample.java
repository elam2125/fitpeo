package org.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();

		WebElement prdsrc = driver.findElement(By.name("q"));
		prdsrc.sendKeys("Ipad");

		WebElement cc = driver.findElement(By.xpath("//button[@type='submit']"));
		cc.click();

		WebElement firstprd = driver.findElement(
				By.xpath("//div[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']"));
		firstprd.click();

		Set<String> allwin = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(allwin);
		driver.switchTo().window(li.get(1));

		WebElement buynow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		buynow.click();

		WebElement em = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		em.sendKeys("aravind2023@gmail.com");

		WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
		cont.click();
		
		WebElement mob = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		mob.sendKeys("987654321");
	}

}
