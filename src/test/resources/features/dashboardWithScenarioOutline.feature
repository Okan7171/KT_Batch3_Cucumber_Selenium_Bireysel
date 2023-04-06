Feature: Dashboard
  @titleChecks
  Scenario Outline: Title checks (<tab> and <module>)
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    And Go to "<tab>" and "<module>"
    Then Verify that "<title1>" and "<title2>" and "<title3>"

    Examples:
      | tab        | module       | title1 | title2     | title3    |
      | Components | Alerts       | Home   | Components | Alerts    |
      | Components | Accordion    | Home   | Components | Accordion |
      | Components | Carousel     | Home   | Components | Carousel  |
      | Components | List Group   | Home   | Components | Listgroup |
      | Components | Modal        | Home   | Components | Modal     |
      | Components | Tabs         | Home   | Components | Tabs      |
      | Components | Tooltips     | Home   | Components | Tooltips  |
      | Components | Charts       | Home   | Components | Charts    |
      | Components | Iframe       | Home   | Components | Iframe    |
      | Components | Open New Tab | Home   | Components | Opennew   |