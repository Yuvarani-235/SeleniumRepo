package week2.day2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

public static void main(String[] args) throws InterruptedException {
		
	    ChromeDriver driver=new ChromeDriver();  
		driver.get("https://leafground.com/button.xhtml");  
		driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class='card']//span)[1]")).click();
		
		
		if(driver.getTitle().contains("Dashboard"))
		
		{
			System.out.println("matched");
		}
		
		driver.navigate().back();
System.out.println(driver.findElement(By.name("j_idt88:j_idt92")).isDisplayed());
System.out.println(driver.findElement(By.xpath("(//div[@class='card']//span)[4]")).getLocation());
Thread.sleep(2000);

System.out.println(driver.findElement(By.xpath("(//h5[text()='Find the Save button color']/following::button)[1]")).getCssValue("background-color"));
System.out.println(driver.findElement(By.xpath("(//div[@class='card']//span)[8]")).getSize());



}}
