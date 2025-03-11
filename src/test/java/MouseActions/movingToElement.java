package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movingToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='textbox']"));
        Actions action = new Actions(driver);
        action.moveToElement(txtbox).click().sendKeys("Shashank").perform();
	}

}
