@AddList
Feature: Shopping list
Scenario Outline: Add First Shoping pick items
	Given  Tap on uncheckbox_layout
	And    Tap on hamburger icon
	And    Tap on new List option
	And    Enter Shopping list name "testqa"
	And    Click on ok button 
	And    Add item menu "<Add item menu>"
	
	Examples:
	|Add item menu|    
	|Testqa       |
	|selenium     |
	|  abc        |
	
	Scenario Outline:: Add Second Shoping pick items
	And    Tap on hamburger icon
	And    Tap on new List option
	And    Enter Shopping list name
	And    Click on ok button
	And    Add item menu "<Add item menu>"
	
	Examples:
	|Add item menu|    
	|shoping1       |
	|qashoping      |
	|  abc2         |
	
	

	
	
	
	

	