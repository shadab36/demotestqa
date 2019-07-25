package testRunner.apptest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import objectRepository.AddListObject;
import objectRepository.DeleteObjects;
import testRunner.BaseClass;

public class DeleteList extends BaseClass {
	@And("^click on menu icon$")
	public void click_on_menu_icon() throws Throwable {
		webelement=driver.findElement(DeleteObjects.moreicon);
		   webelement.click(); 
		   Thread.sleep(500);
		   
	}

	@And("^click on Select list option$")
	public void click_on_Select_list_option() throws Throwable {
		webelement=driver.findElement(DeleteObjects.Delete_List);
		   webelement.click(); 
		   Thread.sleep(500);
	}

	@Then("^Delete the the list of items$")
	public void delete_the_the_list_of_items() throws Throwable {
		webelement=driver.findElement(AddListObject.Ok_Cta);
		 webelement.click(); 
	}
}
