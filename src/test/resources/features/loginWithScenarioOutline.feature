Feature: Login with Scenario Outline
  @scenarioOutline
  Scenario Outline: Positive Login Test with Different Users
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Verify that "<name>" is visible on the dashboard

    Examples:
      | userEmail               | password  | name           |
      | mike@gmail.com          | mike1234  | mike           |
      | john@gmail.com          | John1234. | John           |
      | eddiem@kraft.com        | eddiem12  | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman  | Morgan Freeman |


