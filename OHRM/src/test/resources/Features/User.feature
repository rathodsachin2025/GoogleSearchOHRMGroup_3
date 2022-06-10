Feature: test OHRM user functionality

  Scenario: login with valid credentials
    Given user is on login page
    When user enter username and password
    And user should be logged in successfully
    When User check for the logo
    Then User can find welcome message at top left corner

  Scenario: Admin searches user and modify details successfully
    Given admin is on the user management page
    When admin enters username and click search
    Then admin clicks on reset
    When user click on add button
    And Enters Employee details
    Then Click on save button
    Given admin is on edit user page
    When admin edits users information
    Then user click on save
    When admin selects a user to be deleted
    Then click delete

  Scenario: admin should click on job`
    Given admin is on job page
    When admin is on job title page
    Then user is able to add the job title
    And user should able to delete the job
    Then user is able to edit the job details

  Scenario: admin can update the my info page
    Given Admin is on personal details page
    When admin click on edit button
    And edit user details
    Then click Save
    Given admin is on custom feild
    When admin click edit
    And choose blood groop, vaccination details
    Then admin Click On Save
    When admin select file
    Then click delete button

  Scenario: admin can search employee list
    Given admin is on Employee List page
    When admin enters the employee name and employee ID,Supervisor Name
    Then clicks an search
    And user detail displayed
    When user click on add
    Then enters firstname and lastname
    And click save button
    Then select user to deleted
    And Delete the user
