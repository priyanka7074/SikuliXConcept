import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		Screen s = new Screen();
		
		//google search button
		Pattern googleImg = new Pattern("google_search.PNG");
		s.wait(googleImg,2000);
		s.click();
		
		//sign in button click
		Pattern signinImg = new Pattern("sign_in.PNG");
		s.wait(signinImg,2000);
		s.click();
		
		

	}

}
