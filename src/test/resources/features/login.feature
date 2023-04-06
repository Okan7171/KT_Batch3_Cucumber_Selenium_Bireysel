@regression
@login
Feature: Login
  #As a user, I should be able to login with my valid credentials so that I
  #can reach out to the app to use.
  #Acceptance Criteria:
  #     1. User should be able to login with valid credentials.
  #     2. User should not be able to login with invalid credentials.
  #     3. ...
  #     4. ...

  Background:
    Given The user is on the login page

  @teacher @krafttech @smoke
  Scenario: Login as Mike
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to login

  @student @krafttech @smoke
  Scenario:  Login as Jack
    Given The user is on the login page
    When The user enters valid credentials that belongs to Jhon
    Then The user should be able to login

  @developer @junior
  Scenario: Login as Sebastian
    When The user enters valid credentials that belongs to Eddie Murphy
    Then The user should be able to login

  @SDET @smoke @junior @db
  Scenario: Login as SDET
    When The user enters valid credentials that belongs to Morgan Freeman
    Then The user should be able to login
