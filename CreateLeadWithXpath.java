package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Login
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hariharan");
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("GK");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    System.out.println(driver.getTitle());

	}

}
