package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPaginatedTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int pages = driver.findElements(By.xpath("//ul[@class='pagination']/li/a")).size();
		/*
		 * int n = 1; while (n <= pages) {
		 * driver.findElement(By.xpath("//ul[@class='pagination']/li[" + n +
		 * "]/a")).click();
		 * 
		 * n++; }
		 */

		for (int p = 1; p <= pages; p++) {
			driver.findElement(By.xpath("//ul[@class='pagination']/li[" + p + "]/a")).click();
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			int columns = driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
			for(int r = 1; r<=rows;r++) {
				for(int c = 1;c<=columns;c++) {
					String value = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
				}
				System.out.println();
			}
		}

	}

}
