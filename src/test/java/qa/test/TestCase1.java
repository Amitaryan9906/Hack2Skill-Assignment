package qa.test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
  @Test(priority = 1,enabled = false)
  public void validateBrokenImages() {
  homePage.validateBrokenImg();
  }
  
  @Test(priority = 2,enabled = true)
  public void testUploadAnyFile() {
	  homePage.testUploadFile();
  }
}
