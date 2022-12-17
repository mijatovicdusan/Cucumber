Feature:  Add Employee

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button

  @sprint3 @regression
  Scenario: Adding 1 employee
 #   Given user is navigated to HRMS application

    And user enter first name and last name
    And user clicks on save button
    Then employee is added successfully

    @test1
    Scenario: Adding one employee using feature file

      And user enter "Dusan" and "Mijat"
      And user clicks on save button
      Then employee is added successfully


      @outline
      Scenario Outline: Adding multiple employees using feature file
        And user  enter "<firstName>" and "<lastName>" for adding multiple employees
        And user clicks on save button
        Then employee is added successfully
        Examples:
        |firstName | lastName |
        |petar     |mazar     |
        |petar     |petrovic  |
        |masa      |bear      |


@datatable
Scenario: Adding multiple employees using data table
  When user adds multiple employees and verify that they are added
  |firstName|middleName|lastName|
  |zara     |MS        |camilullah|
  |birgul   |MS        |ozgin     |
  |alina    |MS        |bob       |


  @excel
  Scenario: Adding multiple employees using excel file
    When user adds multiple employees from excel using "EmployeeData" and verify it

