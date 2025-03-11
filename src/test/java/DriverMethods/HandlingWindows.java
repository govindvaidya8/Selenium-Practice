package DriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Java");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).submit();
		List<WebElement> searchLinks= driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a"));
        for(WebElement link: searchLinks) {
        	link.click();
        }
        String parentwind = driver.getWindowHandle();
        Set<String> windowIds = driver.getWindowHandles();
        List<String> windIds = new ArrayList<String>(windowIds);
        for(String windId :windIds) {
        	driver.switchTo().window(windId);
        	if(windId.equals(parentwind)) {
        		continue;
        	}else {
        		driver.close();
        		
        		
        	}
        }
        Thread.sleep(3000);
        driver.quit();
	}

}
