package testRunner.apptest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.DeleteObjects;
import objectRepository.SortingObjects;
import testRunner.BaseClass;

public class Sorting extends BaseClass {
	@When("^Click on setting option$")
	public void click_on_setting_option() throws Throwable {
		webelement=driver.findElement(DeleteObjects.moreicon);
		   webelement.click(); 
		   Thread.sleep(1000);
		   
		   webelement=driver.findElement(SortingObjects.Setting);
		   webelement.click();  
		   Thread.sleep(1000);
		   
		   
	}

	@Then("^Sorting the item list$")
	public void sorting_the_item_list() throws Throwable {
		 webelement=driver.findElement(SortingObjects.Sorting_list);
		   webelement.click();
		   Thread.sleep(1000);
	}

	@And("^Sorting the item list as alphabetical$")
	public void sorting_the_item_list_as_alphabetical() throws Throwable {
		 webelement=driver.findElement(SortingObjects.Alphabetical);
		   webelement.click();
		   Thread.sleep(1000); 
	}

	@And("^click on chhose your preferred layout$")
	public void click_on_chhose_your_preferred_layout() throws Throwable {
		webelement=driver.findElement(SortingObjects.chhose_preferred_layout);
		   webelement.click();
		   Thread.sleep(1000);
	}

	@Then("^observe that the item list in sorfting format$")
	public void observe_that_the_item_list_in_sorfting_format() throws Throwable {
	  
	}


}
