
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class redbus
{
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("Ben");
		System.out.println("Wait starts:"+new Date());
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    List <WebElement> element=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//following-sibling::li"));
	    System.out.println(element.size());
	    
	    for(int i=0;i<element.size();i++)
	    {
	      
	    //System.out.println(element.get(i).getText());
	     
	      if(!element.get(i).getText().contains("Israel"))
	    		  
	      {
	    	 Thread.sleep(2000);
	    	 System.out.println("not present");
	    	 break;
	      }
	    
	      else
	      {
	    	  element.get(i).click();
	    	  break;
	      }
	    	  
	      }
	      
	   // driver.close();
	 
	    
	}
	}

	      
		
        
	


