# pal-tracker
PCF training course
AFTER 
Configuring an App
•	Do we have to do “cf restage ” when we set a new environment variable in PCF?
•	What could be use cases where you will have to do “cf restage” (as opposed to “cf restart”)?
•	(Related question to the above) What are the differences among 3 different ways of running an application on PCF - “pushing”, “restaging”, and “restarting”?
•	What are the environment variables that PCF automatically create for your application instance?
•	Do “cf ssh pal-tracker” and display the values of all Cloud Foundry related environment variables by typing “env | grep CF”
•	What are the examples of PCF log types? (Google “PCF log types”)
•	Try to use “create-app-manifest” command to capture the metadata of your running app into a file and try to use that file to deploy the application
•	If you remove “random-route: true” from your manifest.yml file and then do “cf push”, will it work or will it fail due to “The host is taken: pal-tracker” error? Why?
•	Currently we have testing code for WelcomeController that does the testing of the controller class logic but it does not test Mvc layer, which is covered by API testing using @SpringBootTest.
•	But one trade-off of using @SpringBootTest is that it is slower than Web slice testing because it has to start the server. So you might want to write controller testing code using @WebMvcTest and MockMvc.
•	Find out how you can use IntelliJ version control window to compare your local code against a branch or a tag.
•	Create a WelcomeService that returns a message, WelcomeController depends on the HelloService to get that message, Use Mockito in your
•	WebControllerMockMvcTest code to mock the service, Write the WelcomeServiceTest code to test WelcomeService.
