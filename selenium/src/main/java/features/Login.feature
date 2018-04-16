Feature: for login in leaftabs
Scenario: login
    Given open the Browser
    And	maximize the window
    And enter the URL
    And enter the username as <uname>
    And enter the pass as <pass> 
    When click login button
    Then verify the message
Examples:
 |uname|pass|
 |democsr|crmsfa|
 
 
 