package HandlingCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCheckboxesInAcsending {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> chk_week = driver
				.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[@type='checkbox']"));
		
		for(int i=chk_week.size()-2;i>=1;i--) {
			//if(chk_week.get(i).getDomProperty("id").equals("monday")||chk_week.get(i).getDomAttribute("id").equals("tuesday")||chk_week.get(i).getDomAttribute("id").equals("thursday"))
			chk_week.get(i).click();
			System.out.println(chk_week.get(i).getDomAttribute("id"));
		}

	}

}
