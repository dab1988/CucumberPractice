#@All
Feature: MyAccount-Login Feature
  Description: This feature will test a Login feature
	
@Smoke	
Scenario: Book a Cab within "50" Kilometer
Given Open the Uber App
When Search for the "BMW" card
And Enter Pick Up Location "Zakir Nagar" and Drop Location "Humayun Tomb"
And Board the Cab after "15" minutes and starts the Journey
And Drop on Drop Point "Humayun Tomb"
Then Pay the Fair Rs 300

@Smoke	@Sanity
Scenario: Book a Cab within "50" Kilometer
Given Open the Uber App
When Search for the "BMW" card
And Enter Pick Up Location "Zakir Nagar" and Drop Location "Humayun Tomb"
And Board the Cab after "15" minutes and starts the Journey
And Drop on Drop Point "Humayun Tomb"
Then Pay the Fair Rs 300


@Regression
Scenario: Book a Cab within "50" Kilometer
Given Open the Uber App
When Search for the "BMW" card
And Enter Pick Up Location "Zakir Nagar" and Drop Location "Humayun Tomb"
And Board the Cab after "15" minutes and starts the Journey
And Drop on Drop Point "Humayun Tomb"
Then Pay the Fair Rs 300

@Functional	
Scenario: Book a Cab within "50" Kilometer
Given Open the Uber App
When Search for the "BMW" card
And Enter Pick Up Location "Zakir Nagar" and Drop Location "Humayun Tomb"
And Board the Cab after "15" minutes and starts the Journey
And Drop on Drop Point "Humayun Tomb"
Then Pay the Fair Rs 300