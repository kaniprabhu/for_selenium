Feature: Create Lead for leaftaps

Scenario Outline: Create Lead for Leaftaps using multiple date

#Given Open the Browser
#
#And Load URL

And Enter the UserName as<uName>

And Enter the Password as<pwd>

And Click on Login Button

And Click on CRMS/SFA Link

And Click on Leadbutton

And Click on Create Lead Link

And Enter the CompanyName as<companyName>

And Enter the FirstName as<firstName>

And Enter the LastName as<lastName>

When Click on Createlead button

Then verify Create lead done successfully

Examples:
|uName|pwd|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|Google|Anish|Siva|
|DemoCSR|crmsfa|PayPal|Puvissha|Siva|
