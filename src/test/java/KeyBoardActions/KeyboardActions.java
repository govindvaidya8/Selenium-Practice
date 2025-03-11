package KeyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.xpath("//div[@class='header-links']//li[2]//a"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).perform();
		List<String> windIds = new ArrayList<String>(driver.getWindowHandles());
		String login_winId = windIds.get(1);
		driver.switchTo().window(login_winId);
		WebElement uname = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement btn_login = driver.findElement(By.xpath("//input[@value='Log in']"));
		act.moveToElement(uname).click().sendKeys("govindvaidya8@outlook.com").perform();
		act.moveToElement(password).click().sendKeys("Shashank").perform();
		act.moveToElement(btn_login).click().perform();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://testautomationpractice.blogspot.com/");
		

	}

}
