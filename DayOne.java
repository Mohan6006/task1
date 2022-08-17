package Mohan1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    Actions actions=new Actions(driver);
	    WebElement JobBoard = driver.findElement(By.xpath("//div[text()='Job Board']"));
	    actions.moveToElement(JobBoard).perform();
	    driver.findElement(By.xpath("//a[text()='Applications ']")).click();
	    WebElement name1 = driver.findElement(By.xpath("//a[text()='Content Creator']'//Parent::td'//'Preceding.Sibling::td'//strong"));
	    System.out.println(name1.getText());
	  
	}

}

