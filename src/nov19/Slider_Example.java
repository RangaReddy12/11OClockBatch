package nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Example {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);	
		driver.switchTo().frame(0);
WebElement slider=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
Thread.sleep(5000);
ac.dragAndDropBy(slider, 250, 0).perform();
Thread.sleep(5000);
ac.dragAndDropBy(slider, -150, 0).perform();
Thread.sleep(5000);
driver.close();
	} 

}
