package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Comcast");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinodh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("raja");
		driver.findElement(By.name("submitButton")).click();
		String title1= driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Freshworks");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
	}

}