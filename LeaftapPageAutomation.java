package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapPageAutomation {
//locate thewebele
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geethu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saji");
		
	//locate the source dropdown and select direct mail option by using index			
		WebElement sourceDD= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec=new Select(sourceDD);
		sec.selectByIndex(3);
		
	//locate the 	Marketing Campaign dropdown and select direct mail option by using VisibleText		
		WebElement sourceDD1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1= new Select (sourceDD1);
		sec1.selectByVisibleText("Automobile");		
		
		//locate the 	Industry dropdown and select direct mail option by using Value		
		WebElement sourceDD2=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sec2= new Select(sourceDD2);
		sec2.selectByValue("IND_HARDWARE");		
		
		//click submit button		
		//driver.findElement(By.className("smallSubmit")).click();		
		//print the title		
		//System.out.println(driver.getTitle());
		//driver.close();


	}

}
