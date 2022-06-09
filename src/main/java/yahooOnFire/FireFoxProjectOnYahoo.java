package yahooOnFire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxProjectOnYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\patel\\eclipse-workspace\\SeleniumFirefoxProject\\Drivers\\geckodriver.exe");
		WebDriver yh = new FirefoxDriver();
		yh.manage().window().maximize();
		yh.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2Ffolders%2F1");

		
		
		Thread.sleep(2000);
	
		yh.findElement(By.linkText("Create an account")).click();
		Thread.sleep(3000);

		yh.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Romaty");
		yh.findElement(By.xpath("//input[@class=\"\"]")).sendKeys("tripathi");
		Thread.sleep(2000);

		yh.findElement(By.xpath("//input[@name='userId']")).sendKeys("Rothi1234");
		Thread.sleep(2000);

		yh.findElement(By.cssSelector("input[type='password']")).sendKeys("Ro123456@");
		Thread.sleep(2000);

		yh.findElement(By.xpath("//input[@name='birthYear']")).sendKeys("1963");
		Thread.sleep(2000);

		yh.findElement(By.xpath("//button[text()='Continue']")).click();
	}

}
