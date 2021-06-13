package CallHubProject.CallHubProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PricingScenarios {
	
	WebDriver driver;
	@BeforeTest
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//INabengre//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
     
         
        driver.get("https://callhub.io/pricing/");
driver.manage().window().maximize();
	}
	
	@Test (priority=0)
	 public void verifyMonthlyPrice() throws InterruptedException 
	 {
		System.out.println("Monthly price charges");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		WebElement monthbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gatsby-focus-wrapper']/main/div[2]/div/ul/li[1]")));
	    monthbutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		WebElement box=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[2]/div[2]"));
		driver.manage().timeouts().implicitlyWait(
	             50, TimeUnit.SECONDS);
		WebElement price=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[2]/div[2]/h3"));
		WebElement price1=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[3]/div[2]/h3"));
		WebElement price2=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[4]/div[2]/h3"));
	     System.out.println(price.getText());
		 Assert.assertTrue(price.isDisplayed());
		 System.out.println(price1.getText());
		 Assert.assertTrue(price1.isDisplayed());
		 System.out.println(price2.getText());
		 Assert.assertTrue(price2.isDisplayed()); 
		 System.out.println("********");
	}
	


	
	@Test(priority=1)
	
	public void verifyQuarterlyPrice()
	{
		System.out.println("Quarterly price charges");
		WebDriverWait wait1=new WebDriverWait(driver, 100);
		WebElement quarterbutton=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div/ul/li[2]")));
		quarterbutton.click();
		WebElement price3=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[2]/div[2]/h3"));
		 System.out.println(price3.getText());
		 Assert.assertTrue(price3.isDisplayed());
		 WebElement price4=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[3]/div[2]/h3"));
		 System.out.println(price4.getText());
		 Assert.assertTrue(price4.isDisplayed());
		 WebElement price5=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[4]/div[2]/h3"));
		 System.out.println(price5.getText());
		 Assert.assertTrue(price5.isDisplayed());
		 System.out.println("******");
	}
	
	@Test(priority=2)
	
	public void verifyHalfYearlyPrice()
	{
		System.out.println("Half Yearly price charges");
		WebDriverWait wait2=new WebDriverWait(driver, 100);
		WebElement halfYearlyButton=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div/ul/li[3]")));
		halfYearlyButton.click();
		WebElement price6=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[2]/div[2]/h3"));
		 System.out.println(price6.getText());
		 Assert.assertTrue(price6.isDisplayed());
		 WebElement price7=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[3]/div[2]/h3"));
		 System.out.println(price7.getText());
		 Assert.assertTrue(price7.isDisplayed());
		 WebElement price8=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[4]/div[2]/h3"));
		 System.out.println(price8.getText());
		 Assert.assertTrue(price8.isDisplayed());
		 System.out.println("*******");
	}
	
	@Test(priority=3)
	
	public void verifyYearlyPrice()
	{
		System.out.println("Yearly price charges");
		WebDriverWait wait3=new WebDriverWait(driver, 100);
		WebElement yearlyButton=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div/ul/li[4]")));
		yearlyButton.click();
		WebElement price9=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[2]/div[2]/h3"));
		 System.out.println(price9.getText());
		 Assert.assertTrue(price9.isDisplayed());
		 WebElement price10=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[3]/div[2]/h3"));
		 System.out.println(price10.getText());
		 Assert.assertTrue(price10.isDisplayed());
		 WebElement price11=driver.findElement(By.xpath("//*[@id=\"planpricetab\"]/div[1]/div[1]/table/tbody/tr/td[4]/div[2]/h3"));
		 System.out.println(price11.getText());
		 Assert.assertTrue(price11.isDisplayed());
		
	}
	
	
	
	
	
	@AfterTest
	 public void close()
	 {
		driver.quit();
	 }
	

}
