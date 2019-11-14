package nov5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_gettitle {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		//launch url
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String Expectedtitle="gmail";
		//get title of the page
		String Actualtitle=driver.getTitle();
		//verify exp title is equals to act title
		if(Expectedtitle.equalsIgnoreCase(Actualtitle))
		{
System.out.println("title is matching::"+Expectedtitle+"  "+Actualtitle);
		}
		else 
		{
System.out.println("title is not matching::"+Expectedtitle+"  "+Actualtitle);			
		}
//suspend selenium from execution for 5 seconds		
Thread.sleep(5000);
driver.close();
	}
}



















