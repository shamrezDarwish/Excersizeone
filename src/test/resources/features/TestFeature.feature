Feature: Visit a page and click on a link 

Background: 
	Given I go to url https://www.bbc.co.uk/ 
	
	
Scenario: Visit a page and check the page title 
	Then I check page title 
	
Scenario: login to BBC 
	When I can log in with the following 'sham1@gmail.com' and 'Sham@2022' 
	Then I am logged in 
	
@test
Scenario: navigate to weather page 
	When I can log in with the following 'sham1@gmail.com' and 'Sham@2022' 
	Then I am logged in 
	And I can navigate to the weather page 
	And I can search for the weather in 'Newcastle-upon-tyne' 

	
		
Scenario: navigate to weather page 
	When I can log in with the following 'sham1@gmail.com' and 'Sham@2022' 
	Then I am logged in 
	And I can navigate to the weather page 
	 




