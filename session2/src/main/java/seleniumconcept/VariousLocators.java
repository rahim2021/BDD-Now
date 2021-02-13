package seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abderrahim\\Aug2020_selenium\\session2\\driver\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void loginTest() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Sign in button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 seconds
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='fa fa-university']")).click();
		driver.findElement(By.xpath("//a[@href='https://techfios.com/billing/?ng=accounts/add/']")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("My account");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Saving Account");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("$4300");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("29874264645365");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Rahim Halili");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("2148767763");
		driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("www.BankofAmerica.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

	}

}
