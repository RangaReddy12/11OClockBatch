package nov5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_gettext {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//get text of register 
String Actext=driver.findElement(By.partialLinkText("REG")).getText();
//get url of register link
String urlname=driver.findElement(By.partialLinkText("REG"))
.getAttribute("href");
System.out.println(urlname);
String exptext="register";
if(Actext.equalsIgnoreCase(exptext))
{
System.out.println("Text is matching::"+Actext+"  "+exptext);
}
else
{
System.out.println("Text is Not matching::"+Actext+"  "+exptext);	
}
Thread.sleep(5000);
driver.close();
	}
}
