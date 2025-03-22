package week2.day2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead1 {

	    public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();  
		driver.get("http://leaftaps.com/opentaps/.");  //Launch the Browser
		driver.manage().window().maximize();	//maximize the window
		
		
		//Login the application with username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("CRM")).click(); //Click the "crm/sfa" link
		driver.findElement(By.linkText("Leads")).click();  //Click the "Leads" link
		driver.findElement(By.linkText("Find Leads")).click();   //Click Find leads
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();   //Click phone tab
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98127");	//Enter the phone number
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		
		
		String id= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText(); //Capture the lead ID of the first resulting lead
		Thread.sleep(3000);
		System.out.println(id);

		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click(); //Click the first resulting lead
		Thread.sleep(3000);

		driver.findElement(By.className("subMenuButtonDangerous")).click(); //Click the "Delete" button
		
	    driver.findElement(By.linkText("Find Leads")).click(); //Click "Find leads" again
	    
	    Thread.sleep(5000);
        driver.findElement(By.name("id")).sendKeys(id);  	//Enter the captured lead ID.
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		//Click the "Find leads" button.
		Thread.sleep(3000);
		String displayMessage=driver.findElement(By.className("x-paging-info")).getText();	//Capture the message
		System.out.println(displayMessage);  
		
		
		
		if(displayMessage.contentEquals("No records to display")) {  //Verify the presence of the message "No records to display" in the Lead List.
				
				System.out.println("Matched");
		}
		else
		{
			System.out.println("NotMatched");
		}
		driver.close();		//Close the browser window

	}
	  }
