package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Geethu");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("industryEnumId")).sendKeys("Computer Software");
		
		//locate the 	Ownership dropdown and select S-Corporation option by using VisibleText	
		WebElement sourceDD1= driver.findElement(By.name("ownershipEnumId"));
		Select sec1= new Select (sourceDD1);
		sec1.selectByVisibleText("S-Corporation");	

		//locate the Source dropdown and select S-Corporation option by using Value		
		WebElement sourceDD2=driver.findElement(By.name("dataSourceId"));
		Select sec2= new Select(sourceDD2);
		sec2.selectByValue("LEAD_EMPLOYEE");	
		
		//locate the Marketing Campaign dropdown and select eCommerce Site Internal Campaign" option by using index			
		WebElement sourceDD3= driver.findElement(By.id("marketingCampaignId"));
		Select sec3=new Select(sourceDD3);
		sec3.selectByIndex(6);
				
		//locate the state/province dropdown and select Texas option by using Value		
		WebElement sourceDD4=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sec4= new Select(sourceDD4);
		sec4.selectByValue("TX");
		
		//on create account button
		driver.findElement(By.className("smallSubmit")).click();
				
				
				
	}

}
