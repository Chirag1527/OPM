
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opmakshay {
	 
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\eclipse\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the window
        driver.manage().window().maximize();

        // Open a new browser window
        driver.get("http://projects.e-connectsolutions.com/login.aspx/");
        
        // Locate the username input field and enter your username
        WebElement usernameField = driver.findElement(By.id("txtUserName"));
        usernameField.sendKeys(" ");
        
        // Locate the password input field and enter your password
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(" ");
        
        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        
        // Locate the hours and click it
        WebElement hours = driver.findElement(By.id("lnkUnUtilized"));
        hours.click();
        
        // Locate the month and click it
        // WebElement month = driver.findElement(By.title("View Date Wise Unclocked hours"));
        // WebElement month = driver.findElement(By.cssSelector("[title='View Date Wise Unclocked hours']"));
        WebElement month = driver.findElement(By.xpath("((//a[contains(text(),'May-2024')]))")); //May-2024, Apr-2024
        month.click();
        Thread.sleep(2000);
        
        // Switch to the popup window
           String mainWindowHandle = driver.getWindowHandle();
           for (String handle : driver.getWindowHandles())
           {
            if (!handle.equals(mainWindowHandle))
            {
                driver.switchTo().window(handle);
                break;
            }
           }
   
        //  Click on date to fill opm	
        //  WebElement dateElement = driver.findElement(By.xpath("((//a[contains(text(),'21-May-2024')]))")); //tr[@class='clearfix']//a))[2] or //a[contains(text(),'17-May-2024')]
        //  dateElement.click(); 
        //  Thread.sleep(5000);
                   
        // 	Locate the add effort and click it
        //	WebElement effort = driver.findElement(By.id("lnkAdd")); 
        //  WebElement effort = driver.findElement(By.cssSelector("[data-toggle='modal']"));
        //  WebElement effort = driver.findElement(By.cssSelector("[data-target='#myNewModal']"));
        // 	WebElement effort = driver.findElement(By.xpath("((//a[contains(text(),'Add Effort ')]))"));
        // 	effort.click();	
        //	Thread.sleep(2000);
        	
        	
        	driver.get("http://projects.e-connectsolutions.com/OPM/My_Timer.aspx?Key=F023979F56F69886367A76B857540212&Emp_id=2DF1904F5F017B8F");
        	Thread.sleep(2000);
        	
        //  Locate the text box using an appropriate selector
            WebElement date = driver.findElement(By.id("txtDate")); 
        //  Clear the text box if needed
            date.clear();
        //  Enter a value into the text box
            date.sendKeys("05/21/2024");
            Thread.sleep(2000);
        	
        	
        // 	Locate the calendar icon (fa fa-calendar) using an appropriate locator strategy
        //	WebElement calendarIcon = driver.findElement(By.cssSelector("[class='fa fa-calendar']"));
        //	calendarIcon.click();  
        //	Thread.sleep(4000);
        //	WebElement dateElement1 = driver.findElement(By.xpath("//td[text()='20']"));
        //	dateElement1.click();
            
        //	Locate the login button and click it
        	WebElement submit = driver.findElement(By.id("btnGo"));
        	submit.click();        	
        	
        //	Locate add effort button and click on it
        	WebElement effort = driver.findElement(By.xpath("((//a[contains(text(),'Add Effort ')]))"));
        	effort.click();	
        	Thread.sleep(2000);
        //	xpath  //a[contains(text(),'Add Effort')] or //p[@class='pull-right']//a[1] or //a[@class='btn btn-warning']
        
        //	Locate the project menu inside the popup
        	WebElement projectdropdown = driver.findElement(By.id("ddlProj"));       	
         // Create a Select instance and select an option by visible text, value, or index
        	Select select1 = new Select(projectdropdown);
        	select1.selectByVisibleText(" "); //select1.selectByValue("358"); // or select1.selectByValue("option_value"); or select1.selectByIndex(index);
        	Thread.sleep(3000);
        	
         // Locate the task menu inside the popup
            WebElement tasktypedropdown = driver.findElement(By.id("ddlTaskType")); 
         // Create a Select instance and select an option by visible text, value, or index
            Select select2 = new Select(tasktypedropdown);
            select2.selectByVisibleText(" "); //select2.selectByValue("M"); //select2.selectByValue("option_value"); or select2.selectByIndex(index);
            Thread.sleep(3000);
   
         // Locate the task category menu inside the popup
            WebElement taskcatdropdown = driver.findElement(By.id("ddlTaskCat")); 
           
         // Create a Select instance and select an option by visible text, value, or index
            Select select3 = new Select(taskcatdropdown);
            select3.selectByVisibleText(" "); //select3.selectByValue("22"); // or select3.selectByValue("option_value"); or select3.selectByIndex(index);
            Thread.sleep(5000);
                
         // Wait for the dropdown to be visible and clickable
            WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdown = wait5.until(ExpectedConditions.elementToBeClickable(By.id("select2-ddlTask-container"))); 
            dropdown.click();
         // Locate the input field within the dropdown and type the search term
            WebElement searchBox = driver.findElement(By.xpath("//input[@class='select2-search__field']")); 
            searchBox.sendKeys("RERP3006637");
         // Wait for the search results to be visible
            WebElement searchResult = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'RERP3006637')]")));      
         // Click on the desired search result
            searchResult.click();        
            Thread.sleep(3000);
            
         // Locate the text box using an appropriate selector
            WebElement opmhours = driver.findElement(By.id("txtHrs")); 
         // Clear the text box if needed
            opmhours.clear();
         // Enter a value into the text box
        	opmhours.sendKeys("8.30");

         //	Locate the save button and click it
        	WebElement save = driver.findElement(By.id("LnkSave"));
        	save.click();
        	Thread.sleep(4000);
       
        	
//       // multiple entries in opm
//        	effort = driver.findElement(By.xpath("//a[contains(text(),'Add Effort')]"));
//        	effort.click();	
//         //	xpath  //a[contains(text(),'Add Effort')]
//        
//         // Locate the project menu inside the popup
//        	projectdropdown = driver.findElement(By.id("ddlProj"));       	
//         // Create a Select instance and select an option by visible text, value, or index
//        	select1 = new Select(projectdropdown);
//       	select1.selectByValue("358"); //select1.selectByVisibleText("Raj ERP 3.0"); // or select1.selectByValue("option_value"); or select1.selectByIndex(index);
//        	Thread.sleep(3000);
//        	
//         // Locate the task menu inside the popup
//        	tasktypedropdown = driver.findElement(By.id("ddlTaskType")); 
//         // Create a Select instance and select an option by visible text, value, or index
//          	select2 = new Select(tasktypedropdown);
//          	select2.selectByVisibleText("SES"); //select2.selectByValue("M"); // select2.selectByValue("option_value"); or select2.selectByIndex(index);
//          Thread.sleep(3000);
//   
//         // Locate the task category menu inside the popup
//          taskcatdropdown = driver.findElement(By.id("ddlTaskCat"));           
//         // Create a Select instance and select an option by visible text, value, or index
//          select3 = new Select(taskcatdropdown);
//          select3.selectByVisibleText("Test Case Execution"); //select3.selectByValue("22"); // or select3.selectByValue("option_value"); or select3.selectByIndex(index);
//          Thread.sleep(5000);
//                
//         // Wait for the dropdown to be visible and clickable
//            wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
//            dropdown = wait5.until(ExpectedConditions.elementToBeClickable(By.id("select2-ddlTask-container"))); 
//            dropdown.click();
//         // Locate the input field within the dropdown and type the search term
//            searchBox = driver.findElement(By.xpath("//input[@class='select2-search__field']")); 
//            searchBox.sendKeys("RERP3006636");
//         // Wait for the search results to be visible
//            searchResult = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'RERP3006636')]")));      
//         // Click on the desired search result
//            searchResult.click();        
//            Thread.sleep(2000);
//            
//         // Locate the text box using an appropriate selector
//            opmhours = driver.findElement(By.id("txtHrs")); 
//         // Clear the text box if needed
//            opmhours.clear();
//         // Enter a value into the text box
//            opmhours.sendKeys("1.30");
//
//         //	Locate the save button and click it
//        	save = driver.findElement(By.id("LnkSave"));
//        	save.click();
//        	Thread.sleep(4000);
        	

         // Close the browser
//        	driver.quit();
         
//Thread.sleep(5000);
//Set up WebDriverWait with a timeout of 10 seconds
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	private static WebDriverWait newWebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	}
