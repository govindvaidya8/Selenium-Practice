package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUNAndPassTxtAlignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']/img"));

		if (logo.isDisplayed() == true) {
			System.out.println("Logo is Displayed");
		} else {
			System.out.println("Logo is not Displayed");
		}

		WebElement heading = driver.findElement(By.xpath("//h5[normalize-space()='Login']"));
		String act_headingtxt = heading.getText();
		System.out.println(act_headingtxt);
		if(act_headingtxt.equals("Login")) {
			System.out.println("Heading is Displayed with Valid Text");
		}else {
			System.out.println("Heading is not Displayed with valid text");
		}

	}

}
