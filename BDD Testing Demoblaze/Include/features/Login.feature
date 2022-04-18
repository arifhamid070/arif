Feature: Login feature

  Scenario Outline: Successful Login
    Given User navigate to login page
    When User enter <username> and <password>
    And Click login button
    Then Navigated to Homepage

    Examples: 
      | username  | password                 |
      | Ahmad1234 | hNEBwlQiQdG7Jnsv5GN2Cw== |
