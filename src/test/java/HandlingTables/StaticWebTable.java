package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		// int coloumn =
		// driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		for (int r = 2; r <= rows; r++) {

			String tb_value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();
			if (tb_value.contains("Amit")) {
				String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(author + " ");

			}

		}

	}

}
