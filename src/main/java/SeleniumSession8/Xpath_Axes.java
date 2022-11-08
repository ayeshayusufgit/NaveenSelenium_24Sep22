package SeleniumSession8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://classic.freecrm.com/index.html?e=1 -> //a[text()='Anand
		// Reddy']//parent::td//preceeding-sibling::td/input[@type='checkbox']

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.espncricinfo.com/series/new-zealand-t20i-tri-series-2022-23-1322281/new-zealand-vs-pakistan-final-1322340/full-scorecard");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(getWicketTakerName("Ish Sodhi"));
		// System.out.println(getWicketTakerName("James Neesham"));
		// getPlayerScoreCard("Finn Allen");
		//getPlayerScoreCard("James Neesham").stream().forEach(ele->System.out.println(ele));
		getPlayerScoreCard("Finn Allen").stream().forEach(ele->System.out.print(ele+" "));
		driver.close();
	}

	public static String getWicketTakerName(String playerName) {
		String text = driver
				.findElement(
						By.xpath("//span[text()='" + playerName + "']//ancestor::td//following-sibling::td/span/span"))
				.getText();
		return text;
	}

	public static List<String> getPlayerScoreCard(String playerName) {
		System.out.println();
		System.out.print(playerName+"->");
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//span[text()='" + playerName + "']//ancestor::td//following-sibling::td"));

		for (int i = 1; i < 7; i++) {
			String text = scoreList.get(i).getText();
			// System.out.print(text + " ");
			scoreCardList.add(text);
		}
		// System.out.println();
		return scoreCardList;
	}
}
