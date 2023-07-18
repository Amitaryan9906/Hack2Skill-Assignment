package pageEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents extends BaseTest{

    ElementFetch ele= new ElementFetch();
	
	public void validateBrokenImg() {
		 driver.get("https://the-internet.herokuapp.com/broken_images");

		List<WebElement> imageElements=ele.getWebElements("TAGNAME",HomePageElements.image);
		Assert.assertTrue(imageElements.size()!=0);
//		System.out.print(imageElements.size());
		
		 for (WebElement image : imageElements) {
	            // Retrieve the image source (URL)
	            String imageUrl = image.getAttribute("src");

	            try {
	                // Send an HTTP GET request to the image URL
	                URL url = new URL(imageUrl);
	                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	                connection.setRequestMethod("GET");
	                connection.connect();

	                // Check the response code
	                int responseCode = connection.getResponseCode();
	                if (responseCode != 200) {
	                    System.out.println("Broken image found: " + imageUrl);
	                }

	                // Disconnect the connection
	                connection.disconnect();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
//	 For uploading any file
	public void testUploadFile() {
	
	WebElement fileInput =ele.getWebElement("XPATH", HomePageElements.fileInput);
	WebElement uploadBtn =ele.getWebElement("XPATH", HomePageElements.uploadBtn);
	
	// Assert that the file input element is visible
    Assert.assertTrue(fileInput.isDisplayed(), "File input element is not visible.");
    
    // Assert that the upload button element is visible
    Assert.assertTrue(uploadBtn.isDisplayed(), "Upload button element is not visible.");
	
	String filePath="D:\\SDET_Manual_Automation_Assignments\\Hack2Skill\\abc.txt";
	
    try {
	fileInput.sendKeys(filePath);
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	uploadBtn.click();
	 } catch(Exception e) {
         e.printStackTrace();
         Assert.fail("File upload failed.");
     }
	}
}
