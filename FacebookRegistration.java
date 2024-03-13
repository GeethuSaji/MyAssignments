package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Gourav");
		driver.findElement(By.name("lastname")).sendKeys("Krishnan");
		driver.findElement(By.name("reg_email__")).sendKeys("beenaar9@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("beenaar9@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Strangers@123");
		driver.findElement(By.id("day")).sendKeys("20");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("1988");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}

}
