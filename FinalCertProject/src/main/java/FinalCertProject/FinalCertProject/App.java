package FinalCertProject.FinalCertProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver","/home/edureka/Downloads/geckodriver");
    	WebDriver driver = new FirefoxDriver();
    	System.out.println("Hi, This is validation step for PHP project");
    	driver.get("http://localhost:9090");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("About Us")).click();
    	//Thread.sleep(5000);
    	driver.quit();}}

