package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingonButtonandSettingValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement lnk_login = driver.findElement(By.xpath("//div[@class='header-links']//li[2]//a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnk_login);
		WebElement txt_uName = driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].setAttribute('value','govindvaidya8@outlook.com');", txt_uName);
		WebElement password = driver.findElement(By.id("Password"));
		js.executeScript("arguments[0].setAttribute('value','Shashank');", password);
		WebElement btn_login = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		js.executeScript("arguments[0].click();", btn_login);
		WebElement img = driver
				.findElement(By.xpath("//div[@class='product-item' and @data-productid = '75']//a//img"));
		js.executeScript("arguments[0].scrollIntoView();", img);
		// js.executeScript("document.body.style.zoom = '50%';");
		js.executeScript("window.scrollBy(0,50)");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
