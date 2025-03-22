package week2.day2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();  
		driver.get("http://leaftaps.com/opentaps/.");  
		driver.manage().window().maximize();
		
		//Login the application with username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click(); ////Click the "crm/sfa" link
		driver.findElement(By.linkText("Leads")).click(); //Click the "Leads" link
		driver.findElement(By.linkText("Create Lead")).click(); //Click Create leads
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC Company");	//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Yuvarani");	//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");	//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("yuva");		////Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information");	//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Technology");		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yuva123@gmail.com");	//Enter your email in the E-mail address Field using the locator of your choice.
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));		//Select State/Province as NewYork Using Visible Text.
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();		//Click on the Create Button.
		driver.findElement(By.linkText("Edit")).click();		//Click on the edit button.
		Thread.sleep(3000);
		driver.findElement(By.name("description")).clear();			//Clear the Description Field.
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("test");		//Fill the Important Note Field with Any text.
		driver.findElement(By.name("submitButton")).click();		//Click on the update button
	    System.out.println(driver.getTitle());			//Get the Title of the Resulting Page.
		
	    driver.close();		//Close the browser window
		
		
		
		
		

	}

}
