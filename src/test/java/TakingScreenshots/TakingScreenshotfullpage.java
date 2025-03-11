package TakingScreenshots;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotfullpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String timestamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage" + "-" + timestamp + ".png");
		source.renameTo(target);

		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img"));
		File source1 = logo.getScreenshotAs(OutputType.FILE);
		File target1 = new File(System.getProperty("user.dir") + "\\screenshots\\logo" + "-" + timestamp + ".png");
		source1.renameTo(target1);
	}

}
