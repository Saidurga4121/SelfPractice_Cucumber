Feature: Login functionality

#Scenario: Login with valid credentials
#					Given User navigates to login page
#					When User enters email address as "saidurgareddy4121@gmail.com" into email field
#					And User enters invalid password "1234567890" into password field
#					And User clicks on Login button


Scenario Outline: Login with valid credentials with examples
					Given User navigates to login page
					When User enters email address as "<username>" into email field
					And User enters invalid password "<password>" into password field
					And User clicks on Login button
Examples:
| username           | password |
| saidurga@gmail.com | abc			|		
| abc@gmail.com			 | xyz	    |
			
			

# " " represents string value and normal value represents int value in the feature file.

# the difference between scenario and scenario outline is ...scenario outline will have examples and scenario will have input in the sentence itself.

# scenario- scenario includes all the possible circumstances of a feature . it is written in gherkin language
# scenario outline- can be used to run the same scenario multiple number of times by providing multiple input in the form of examples
# background - it is like a pre requstie...will run at the top before executing the first step in scenario
# hooks- block of code that runs before each scenario and after each scenario( @before, @ after)
# before hook will run first ... then the back ground will be executed and then the scenario will be executed.
# hooks will run in the order specified.
# @RunWith annotation tells JUnit that tests should run using the Cucumber class
# cucumber version-7.10
# chrome version-114
# selenium version- 4.9