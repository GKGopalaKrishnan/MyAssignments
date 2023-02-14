package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("Login")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_CompanyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_FirstName")).sendKeys("GK");
		driver.findElement(By.id("createLeadForm_LastName")).sendKeys("GopalaKrishnan");
		driver.findElement(By.id("createLeadForm_FirstName(Local)")).sendKeys("GK");
		driver.findElement(By.name("createLeadForm_Department")).sendKeys("Tester");
		driver.findElement(By.name("createLeadForm_Description")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_E-mail address")).sendKeys("xyz@gmail.com");
		
		WebElement source = driver.findElement(By.id("createLeadForm_SelectStateProvince"));
		Select sp = new Select(source);
	    sp.selectByVisibleText("New York");
	    driver.findElement(By.name("Create Lead")).click();
	    driver.findElement(By.name("Edit Lead")).click();
	    driver.findElement(By.name("createLeadForm_Description")).clear();
	    driver.findElement(By.name("createLeadForm_ImportantNote")).sendKeys("Welcome");
	    driver.findElement(By.name("Update Lead")).click();
	    String title = driver.getTitle();
		System.out.println(title);
		
	    
	    
	}

}
