package seleinu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\program files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/SearchHotel.php");
		WebElement User=driver.findElement(By.id("username"));
		User.sendKeys("karthikkrish9697");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Welcome@123");
		driver.findElement(By.id("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String name=driver.findElement(By.id("username_show")).getAttribute("value");
		System.out.println(name);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesrc=driver.getPageSource();
		System.out.println(pagesrc);
		//driver.close();
		//driver.quit();
	}

}
