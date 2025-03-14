package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdrpdwn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(country);
		List<WebElement> countryList = s.getOptions();
		for (WebElement c : countryList) {
			System.out.println(c.getText());
			if (c.getText().equals("India")) {
				c.click();
			}
		}
		boolean multi = s.isMultiple();
		System.out.println(multi);
	}

}
