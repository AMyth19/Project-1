package session;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Google {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement EmailAddress=driver.findElement(By.id("email"));
	EmailAddress.sendKeys("amitkanani09@gmail.com");
	WebElement Password=driver.findElement(By.id("pass"));
	Password.sendKeys("Password123$");
	WebElement Login=driver.findElement(By.name("login"));
	Login.click();
	}
}