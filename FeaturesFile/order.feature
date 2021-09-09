Feature: Test Background Feature
  Description: The purpose of this feature is to test the Background keyword

 Background: User is Logged In
        Given Amazon Application is logged in with a Valid User
        When User Click Orders Link

 Scenario: To Check Closed Order Detais
      And  User Click on Closed Orders Link
      Then User should only see Closed Orders
      
      
 Scenario: To Check Open Order Detais
      And  User Click on Open Orders Link
      Then User should only see Open Orders
      
      
 Scenario: To Check Cancelled Order Detais
      And  User Click on Cancelled Orders Link
      Then User should only see Cancelled Orders
      
       
 Scenario: To Check Rejected Order Detais
      And  User Click on Rejected Orders Link
      Then User should only see Rejected Orders