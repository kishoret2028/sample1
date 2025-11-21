package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kisho\\eclipse-workspace\\Testing1\\target\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/"); 
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
