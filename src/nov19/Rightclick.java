package nov19;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);	
//right clcik on gmail link
ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
Robot r=new Robot();
//to press down arrow in keyboard
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(6000);
//to press down arrow in keyboard
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(6000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(6000);
ArrayList<String>allwins=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(allwins.get(1));
Thread.sleep(6000);
driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
Thread.sleep(6000);
ArrayList<String>allwins1=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(allwins1.get(2));
Thread.sleep(6000);
driver.findElement(By.name("identifier")).sendKeys("pranga2010");

	}

}















