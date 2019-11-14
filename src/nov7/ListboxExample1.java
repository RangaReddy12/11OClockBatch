package nov7;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListboxExample1 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
//store month listbox in to select class
Select	monthlistbox=new Select(driver.findElement(By.id("month")));
monthlistbox.selectByVisibleText("Aug");
Thread.sleep(4000);
//store year listbox in to select class
Select yearlist=new Select(driver.findElement(By.id("year")));
yearlist.selectByVisibleText("1998");
Thread.sleep(4000);
yearlist.selectByValue("1978");
Thread.sleep(4000);
monthlistbox.selectByIndex(10);
System.out.println(monthlistbox.getFirstSelectedOption().getText());
Thread.sleep(4000);
yearlist.selectByIndex(40);
System.out.println(yearlist.getFirstSelectedOption().getText());
Thread.sleep(4000);
driver.close();
	}

}












