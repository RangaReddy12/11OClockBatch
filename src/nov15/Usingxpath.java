package nov15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Usingxpath {
public static void main(String[] args) throws Throwable{
WebDriver driver=new ChromeDriver();
driver.get("https://facebook.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ritameta");
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akhi");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ritameta@gmail.com");
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Ritameta@gmail.com");
driver.findElement(By.xpath("//*[contains(@name,'wd')]")).sendKeys("test12345567");
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[1]")))
.selectByIndex(20);
Thread.sleep(5000);
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[2]")))
.selectByIndex(12);
Thread.sleep(5000);
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[3]")))
.selectByIndex(50);
Thread.sleep(5000);
WebElement maleradio=driver.findElement(By.xpath("//*[@value='2'and @type='radio']"));
if(!maleradio.isSelected())
	maleradio.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(5000);
driver.close();

	}

}








