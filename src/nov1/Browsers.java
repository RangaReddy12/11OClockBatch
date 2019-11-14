package nov1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browsers {
public static void main(String[] args) {
//chromebrowser
WebDriver driver=new ChromeDriver();
driver.get("https://naukri.com");
driver.manage().window().maximize();
driver.findElement(By.id("u_0_"));
	}
}
