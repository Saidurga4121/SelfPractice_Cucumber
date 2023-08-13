Feature: Registration functionality

#Scenario: User creates an account only with mandatory fields
#					Given User navigates to Register Account page
#					Then User enters the details into below fields
#								|firstName	|Arun												|
#								|lastName		|Motoori										| 
#								|telephone	|1234567890									|
#								|password		|12345											|
#					And User selects Privacy Policy
#					And User clicks on Continue button
#					Then User account should get created successfully



# using list
Scenario: User creates an account only with mandatory fields
					Given User navigates to Register Account page
					Then User enters the details into below fields
								|Arun			|   Motoori	| 1234567890	|12345	|
								|sai			|   durga	  | 9502796111	|12345	|
					And User selects Privacy Policy
					And User clicks on Continue button
					Then User account should get created successfully

# using maps					
#Scenario: User creates an account only with mandatory fields
#					Given User navigates to Register Account page
#					Then User enters the details into below fields
#					      |firstName|lastName		|telephone		|password|
#								|Arun			|   Motoori	| 1234567890	|12345	 |
#								|sai  		|   durga  	| 9502796111	|14345	 |
#					And User selects Privacy Policy
#					And User clicks on Continue button
#					Then User account should get created successfully