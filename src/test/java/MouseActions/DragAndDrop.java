package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		WebElement source = driver.findElement(By.xpath("//div[@id='draggableElement']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppableElement']"));
        Actions action = new Actions(driver);
        Action drganddrp = action.dragAndDrop(source, target).build();
	    drganddrp.perform();
	}

}
