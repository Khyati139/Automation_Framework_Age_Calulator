Feature: Age Calculation Feature 

			Scenario: Calculate Age for Valid Birthdates   
   		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
			When user enter "Khyati Gondaliya" in username textbox
			And user select the "13/06/1997" in date of birth textbox
			And user click on submit button
			Then Verify that "Hello Khyati Gondaliya!Your age is 26" text should be displayed 
		
			Scenario: Calculate age for today's birthdate
  		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
  		When user enter "Khyati Gondaliya" in username textbox
  		And user select today's birthdate "12/08/2023" in date of birth textbox
			And user click on submit button
			Then Verify that "Hello Khyati Gondaliya!Your age is 0" text should be displayed 
		

 
 
    
    