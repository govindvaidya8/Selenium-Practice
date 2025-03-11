package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Shrinidhi");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("iPhone");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Raichur");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']")).click();
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	    driver.switchTo().frame(frame4);
	    driver.findElement(By.name("mytext4")).sendKeys("Vaidya");
	}

}
