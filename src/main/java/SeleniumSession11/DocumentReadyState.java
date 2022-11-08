package SeleniumSession11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentReadyState {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");

//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		String jsCommand="return document.readyState";
//		if(jse.executeScript(jsCommand).toString().equals("complete")) {
//			System.out.println("The page is completely loaded");
//		}

		jsWaitForPageToLoad(10);
	}

	public static void jsWaitForPageToLoad(int timeOut) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String state = "return document.readyState";
		if (jse.executeScript(state).toString().equals("complete")) {
			System.out.println("The page is completely loaded");
			return;
		}

		for (int i = 0; i < timeOut; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (jse.executeScript(state).equals("complete")) {
				System.out.println("The page is completely loaded");
				break;
			}
		}
	}

}
