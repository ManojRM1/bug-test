@tag
Feature: Login feature
  As a GitHub user, I want to test the login funcationality of application

  @tag1
  Scenario Outline: Login to GitHub
    Given User login to application with Valid "<name>" and "<pass>"
    Then User is able to verify scenario for login

    Examples: 
      | name  | pass  |
      | name1 |     5 |
      | name2 |     7 |

      @tag2
  Scenario : Verify Error messages in SignUp page
    Given User login to application with invalid credentials
    Then User is able to verify error scenarios in the application
