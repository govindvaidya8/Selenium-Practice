package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingSpecificDataFromPaginatedTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int pages = driver.findElements(By.xpath("//ul[@class='pagination']/li/a")).size();
		for (int p = 1; p <= pages; p++) {
			driver.findElement(By.xpath("//ul[@class='pagination']/li[" + p + "]/a")).click();
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			for (int r = 1; r <= rows; r++) {
				String value = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]"))
						.getText();
				double price = Double.parseDouble(value.substring(1));
				if (price >= 10.0 && price <= 20.0) {
					String name = driver
							.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]"))
							.getText();
					driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]//input"))
					.click();
					System.out.println(name + "\t" + price);
				}

			}
		}

	}

}
