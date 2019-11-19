package nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		int x=dst.getLocation().getX();
		int y=dst.getLocation().getY();
		System.out.println(x+"    "+y);
		ac.dragAndDropBy(source, x, y).perform();
		Thread.sleep(5000);
		if(dst.getText().contains("Dropp"))
		{
			System.out.println("drag and drop success");
		}
		else{
			System.out.println("drag and drop Fail");
		}
		Thread.sleep(5000);
		//come to frame
		driver.switchTo().defaultContent();
				//driver.close();
			}

	}















