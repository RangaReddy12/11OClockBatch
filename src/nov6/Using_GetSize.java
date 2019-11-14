package nov6;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_GetSize {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
WebElement mobiletextbox=driver.findElement(By.name("reg_email__"));
//get location of element
Point p=mobiletextbox.getLocation();
System.out.println("x cooridinates::"+p.getX()+"  "+"Y coordinates::"
+p.getY());
driver.navigate().to("");
driver.close();
	}

}
