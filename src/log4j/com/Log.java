package log4j.com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {
	public static void main(String[] args) throws InterruptedException  {
		// Logger anitha=
		try {
		 Logger log=Logger.getLogger("Log.class");
		 PropertyConfigurator.configure("log4j.properties");
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\eclipse-workspace\\log4j\\driverfiles\\chromedriver.exe");
	     
	     WebDriver driver=new ChromeDriver();//open browser
	    
	    driver.get("http://127.0.0.1/orangehrm-2.6/index.php");//open url
	    Thread.sleep(2000);
	    driver.findElement(By.name("txtUserName")).sendKeys("admin");
	     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
	    
	    log.info("login complited");
	    Thread.sleep(3000);
		
		
		
	    //mouse over
	    

	}


}
