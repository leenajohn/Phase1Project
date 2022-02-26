package test;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProject {
	/**@author Leena John 
	 * 
	 * Project used to find an element from the browser i.e. iphone12 and its price
	 * 
	 * @param args
	 */
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Adding chrome and firefox drivers
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			//Accessing Amazon website
			driver.get("https://www.amazon.in/");   
			
			//Maximize window
			driver.manage().window().maximize();
			
			//wait for browser to load - implicit
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement SearchFile = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			SearchFile.sendKeys("Iphone 12");
			WebElement Btn = driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']"));
			
			Btn.click();
			//xpath to find iphone12 and price
				List<WebElement> P1 = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
				List<WebElement> Pp1 = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
				System.out.println(P1.size());
				//System.out.println(Pp1.size());
				
				for(int i=0 ;i<P1.size();i++)
				{
					System.out.println("Product Name = " +P1.get(i).getText()+ "price is "+Pp1.get(i).getText());
				}

			
			driver.close();	

	}

	}




