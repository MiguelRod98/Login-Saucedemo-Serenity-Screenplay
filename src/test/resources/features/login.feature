#Autor: Miguel Rodriguez

@Stories

Feature: Login on the SauceLabs website

  Scenario: User login on the SauceLabs page
    Given that the user enters the SauceLabs page
    When a user fills out the login form correctly
      | username      | password     |
      | standard_user | secret_sauce |
    Then the login is successful


