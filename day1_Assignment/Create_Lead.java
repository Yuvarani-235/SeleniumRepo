package week2.day1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Lead {

		public static void main(String[] args) {
			
		ChromeDriver driver=new ChromeDriver();  
		driver.get("http://leaftaps.com/opentaps/.");  
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rani");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
