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
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://9anime.org.lv/86-eighty-six-episode-1/");
		String secondurl =driver.getCurrentUrl();
		System.out.println(secondurl);
		
		if(url.equals(secondurl)) {
			System.out.println("same url");
		}
		else{
			System.out.println("different url");
		}
	}

}
