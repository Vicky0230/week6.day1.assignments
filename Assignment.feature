Feature: login to the leaftaps Application

Background:

	Given Launch Chrome Browser
	When  Load URL 'http://leaftaps.com/opentaps'
	And  Type Username as 'DemoSalesManager'
	And  Type password as 'crmsfa'
	And  click the login Button
	And  click the CRM Button
	And  click Lead button
	
	Scenario Outline: Duplicate Leads

	And  click the Find Leads Button
	And click the Email Button
	And Type email as <email>
	And click the FindLeads Button
	And Get the Lead Name
	And  click the First Match Button
	And click the SubMenu Button
	And Verify the Title
	And click the Submit Button
	And Verify the LeadName
	Then close the browser
	
Examples:
|email|
|aravindraman440@gmail.com|
|abc@gmail.com|

Scenario Outline:Delete Leads
	And  click Find Leads button
	And click Phone button
	And Send phoneNumber <phoneNumber>
	And Submit Find Leads button
	And Get LeadId
	And  Click firdtMatch
	And Click Delete
	And Click Find Leads
	And Send LeadId button
	And Click Find Leads Button
	And Get Display Message & Verify
	Then close the browser
	
	Examples:
|phoneNumber|
|234|
|99|

	