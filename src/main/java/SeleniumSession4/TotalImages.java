package SeleniumSession4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//total number of images on the page
		//print the url of each image
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> imgList=driver.findElements(By.tagName("img"));
		System.out.println("Total Images="+imgList.size());
		for(WebElement element:imgList) {
			//href(url) prop only for links,src(url) for images
			String sourceUrl=element.getAttribute("src");
			System.out.println();
		}
		driver.close();
	}

}
