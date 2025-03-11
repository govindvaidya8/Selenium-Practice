package HandlingCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> rd_gender = driver
				.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[@type='radio']"));
		for (WebElement gender : rd_gender) {
			if (gender.getDomAttribute("id").equals("male"))
				gender.click();
		}

		if (rd_gender.get(0).isSelected()) {
			System.out.println("Male gender is Selected");
		} else {
			System.out.println("Male gender is not selected");
		}
	}

}
