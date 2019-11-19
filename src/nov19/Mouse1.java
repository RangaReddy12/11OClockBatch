package nov19;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse1 {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//close banner window
		ac.sendKeys(Keys.ESCAPE).build().perform();
WebElement babykids=driver.findElement(By.xpath("//ul/li[5]/span"));	
ac.moveToElement(babykids).perform();
Thread.sleep(5000);
WebElement puzzles=driver.findElement(By.xpath("//a[contains(text(),'Puzzles')]"));
ac.moveToElement(puzzles).click();
ac.pause(7000).perform();
Thread.sleep(5000);
System.out.println(driver.getTitle());
Thread.sleep(5000);
driver.close();
	}

}






