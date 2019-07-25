package testRunner.apptest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import objectRepository.AddListObject;
import testRunner.BaseClass;

public class AddList extends BaseClass {
	@Given("^Tap on uncheckbox_layout$")
	public void tap_on_uncheckbox_layout() throws Throwable {
		try {
	   webelement=driver.findElement(AddListObject.ClickUncheck_Radio_button);
	   webelement.click();
	   Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
	
	}

	@And("^Tap on hamburger icon$")
	public void tap_on_hamburger_icon() throws Throwable {
		webelement=driver.findElement(AddListObject.MenuIcon);
		   webelement.click();
	   
	}

	@And("^Tap on new List option$")
	public void tap_on_new_List_option() throws Throwable {
	   
		webelement=driver.findElement(AddListObject.NewList);
		   webelement.click(); 
	}

	@And("^Enter Shopping list name \"([^\"]*)\"$")
	public void enter_Shopping_list_name(String name) throws Throwable {
		webelement=driver.findElement(AddListObject.create_Shopping_list);
		   webelement.click(); 
		   Thread.sleep(500);
		   webelement.sendKeys(name);
		   Thread.sleep(500);
	   
	}

	@And("^Click on ok button$")
	public void click_on_ok_button() throws Throwable {
		webelement=driver.findElement(AddListObject.Ok_Cta);
		   webelement.click();   
	   
	}

	@And("^Add item menu \"([^\"]*)\"$")
	public void add_item_menu(String arg1) throws Throwable {
	   webelement=driver.findElement(AddListObject.Enter_item);
	   webelement.click(); 
	   webelement.clear();
	   Thread.sleep(500);
	   webelement.sendKeys(arg1);
	   
	}

}