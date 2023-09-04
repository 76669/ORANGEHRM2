import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Time {

	public static void main(String[] args) {
		try {
			
		
		FileInputStream fis=FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\All_in_one\\src\\main\\java\\MyData\\Data.Properties");
		Properties p = new Properties();
		
		String mybrowser=p.getProperty("browser");
		System.out.println("FireFox");
		System.out.println("Orange HRM");
		System.out.println("Admin");
		System.out.println("admin123");
		System.out.println("login");
		System.out.println("Time");
		System.out.println("graygah roynando sebastian");
		System.out.println("view");
		System.out.println("Edit");
		System.out.println("Add row");
		System.out.println("Delet");
		System.out.println("Attendance");                     
		System.out.println("My recodrs");
		System.out.println("punch in/out");
		System.out.println("Reports");
		System.out.println("project reports");
		System.out.println("Employee reports");
		System.out.println("Attendance Summary");
		System.out.println("Project info");
		System.out.println("Customers");
		System.out.println("Projects");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		   
		  Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		  Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();
		
		  Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
		
		  Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
		
		  Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td/button/i")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[10]/button")).click();  
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		  
		  Thread.sleep(3000);
			 
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]")).click();
		
		  Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[3]/a")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
	   
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("vhk ltd");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("medical company");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")).sendKeys("zopvi");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/textarea")).sendKeys("zopvi zo");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/button")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div/div[2]/input")).sendKeys("vk");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("communciation");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[3]/button[2]")).click();
	    
	    
		} catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
	}

	private static FileInputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
			
}
