package nov6;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_Commands {
public static void main(String[] args)throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("pagetitle[1]::"+driver.getTitle());
		//clik on gmail link
		driver.findElement(By.partialLinkText("Gm")).click();
		Thread.sleep(5000);
		System.out.println("pagetitle[2]::"+driver.getTitle());
		//click on back
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("pagetitle[3]::"+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("pagetitle[4]::"+driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}








