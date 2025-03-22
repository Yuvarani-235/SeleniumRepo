package week2.day2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_select {

		public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();  
		driver.get("http://leaftaps.com/opentaps/.");  			//Launch the browser
		driver.manage().window().maximize(); 					//Maximize the window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");		//Enter user name
		driver.findElement(By.id("password")).sendKeys("crmsfa");				//Enter password
		driver.findElement(By.className("decorativeSubmit")).click();			//click on Login button
		
		driver.findElement(By.partialLinkText("CRM")).click();					//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("Accounts")).click();					//Click on the "Accounts" tab.
		driver.findElement(By.partialLinkText("Create")).click();				//Click on the "Create Account" button
		
		driver.findElement(By.className("inputBox")).sendKeys("YuvaS");	//Enter an account name
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); // Enter a description as "Selenium Automation Tester
		
		WebElement industry= driver.findElement(By.name("industryEnumId"));
		Select ind=new Select(industry);
		ind.selectByIndex(3);					// Select Industry dropdown option as "Computer software" using SelectByIndex
		
		WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("S-Corporation"); // Select Ownership dropdown option as "S-Corporation" using SelectByVisibleText
		
		WebElement source= driver.findElement(By.name("dataSourceId"));
		Select so=new Select(source);
		so.selectByValue("LEAD_EMPLOYEE"); // Select source dropdown option as "Employee" using SelectByValue
		
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select mar=new Select(marketing);
		mar.selectByIndex(6); 			// Select marketing dropdown option as "eCommerce Site Internal Campaign" using SelectByIndex
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sta=new Select(state);
		sta.selectByValue("TX");		// Select state dropdown option as "Texas" using SelectByValue
		
		driver.findElement(By.className("smallSubmit")).click(); //Click on the submit button
		
		WebElement sel=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		System.out.println(sel.getText());  // to get the account name next
		
		if(sel.getText().contains("YuvaS"))   //verify the account name is displayed correctly
		{
			System.out.println("Account name matched");
		}
		else {
			System.out.println("Account name not matched"); 
		}
		
		driver.close(); //close the window
}

}
