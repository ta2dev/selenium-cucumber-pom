# Author 		: automationtest.dev@gmail.com
# LinkedIn 	: https://www.linkedin.com/in/test-automation-development-bbb664239/
# GitHub		: https://github.com/ta2dev
# Docker		: https://hub.docker.com/u/ta2dev
#
@OrangeHRM_Basic
Feature: Basic Functionalities of Orange HRM Application

  Scenario Outline: Verify Assign Leave Functionality
    Given Login to application using "<username>" and "<password>"
    When Verify the Dashbaord page
    Then Click on Assign Leave Button
    And Verify Assign Leave Page

    Examples: 
      | username | password |
      | admin    | admin123 |

  Scenario Outline: Verify Leave List Functionality
    Given Login to application using "<username>" and "<password>"
    When Verify the Dashbaord page
    Then Click on Leave List Button
    And Verify Leave List Page

    Examples: 
      | username | password |
      | admin    | admin123 |

  Scenario Outline: Verify Timesheets Functionality
    Given Login to application using "<username>" and "<password>"
    When Verify the Dashbaord page
    Then Click on My Timesheets Button
    And Verify Timesheet Page

    Examples: 
      | username | password |
      | admin    | admin123 |
