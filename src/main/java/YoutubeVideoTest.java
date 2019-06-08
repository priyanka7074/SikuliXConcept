import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeVideoTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/watch?v=wpZ0FjJQ8qs&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=23");
		
		//create an object of screen class --- Coming from sikuli
		Screen s = new Screen();
		
		//Skip Ads icon
		Pattern skipImg = new Pattern("SkipAdd.PNG");
		s.wait(skipImg,7000); //wait for 2 secs
		s.click();
		s.click();
		
		//Settings icon
		Pattern settingImg = new Pattern("settings.PNG");
		s.wait(settingImg,4000); //wait for 2 secs
		s.click();
		
		//Auto img quality icon
		Pattern autoImg = new Pattern("quality.PNG");
		s.wait(autoImg,5000); //wait for 2 secs
		s.click();
		s.click();
	
		
		
//		//pause icon
//		Pattern pauseImg = new Pattern("pause.PNG");
//		s.wait(pauseImg,2000); //wait for 2 secs
//		s.click();
//		s.click();
//		
//		//play icon
//		Pattern playImg = new Pattern("play.PNG");
//		s.wait(playImg,2000); //wait for 2 secs
//		s.click();
//		s.click();
		
		
		
		
		
		
		

	}

}
