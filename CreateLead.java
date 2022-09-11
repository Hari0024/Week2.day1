package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GK");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hari");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Learning");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harry5orion.24@gmail.com");
	    WebElement dd=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    			Select dd1=new Select(dd);
	    			dd1.selectByValue("AL");
	    			
	    WebElement ddrop=driver.findElement(By.id("createLeadForm_industryEnumId"));
	    			Select dd2=new Select(ddrop);
	    			dd2.selectByValue("IND_DISTRIBUTION");			
	    			
	    driver.findElement(By.name("submitButton")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    

	}

}
