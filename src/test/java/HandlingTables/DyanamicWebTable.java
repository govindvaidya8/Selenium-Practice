package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int rows = driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
		int columns = driver.findElements(By.xpath("//table[@id='taskTable']//tr//th")).size();
		/*
		 * for (int r = 1; r < rows; r++) { for (int c = 1; c <= columns; c++) { String
		 * value = driver.findElement(By.xpath("//table[@id='taskTable']//tr[" + r +
		 * "]//td[" + c + "]")) .getText(); System.out.print(value + " "); }
		 * System.out.println(); }
		 */

		int exp_col = 0;
		for (int i = 1; i <= columns; i++) {
			String colName = driver.findElement(By.xpath("//table[@id='taskTable']//tr//th[" + i + "]")).getText();
			if (colName.equals("Memory (MB)")) {
				exp_col = i;
			}
		}
		for (int r = 1; r < rows; r++) {

			String value = driver.findElement(By.xpath("//table[@id='taskTable']//tr[" + r + "]//td[" + exp_col + "]"))
					.getText();
			double num = Double.parseDouble(value.substring(0, value.indexOf(' ')));
			if (num > 80.0 || num < 40.0) {
				String browser = driver.findElement(By.xpath("//table[@id='taskTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(browser + " ");
			}

		}
	}

}
