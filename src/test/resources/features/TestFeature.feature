Feature: Visit a page and click on a link 

Background: 
	Given I go to url http://www.smartclient.com/smartgwt/showcase/#featured_tile_filtering
	
@test
Scenario: Visit a page and check the page title 
	Then I check page title 
	

	

Scenario: navigate to Search
	When User Click on Animal 
	And  User fill out form with letter A
	And User select 40 for Max life span 
	And user can select Life Span 
	And User should Select checkbox  to Ascending
	Then User should click on filter 
	
	 




