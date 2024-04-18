
Hackathon Project 
======================================================================================

Problem Statement : Identify Car Wash Services
--------------------------------------------------------------------------------------

Display 5 Car washing services name and Amount
1. Select service type as Car.
2. Select sub category as SUV.
3. Capturing names and amount and different state-city combination service addresses.
(Suggested Site: doorstepwash.com however  you are free to choose any other legitimate site)


Detailed Description : Hackathon Project
---------------------------------------------------------------------------------------

1. open the Given url, select service type as "car" and select sub category as "SUV" and click on "Go for it" button,
   capture all service name and amount.
2. Try to register, fill the form with any one input invalid (example: Email); Capture the error message & display.
3. Click our center and select state-city combination, Capture the address details.
(Suggested Site: doorstepwash.com however  you are free to choose any other legitimate site) 


Key Automation Scope :
----------------------------------------------------------------------------------------

1. Handling search option
2. Navigate to other pages
3. Filling form (in different objects in web page)
4. Capture warning message
5. Navigating back to home page  


The Tools and Technology :
----------------------------------------------------------------------------------------
Selenium
TestNG
cucumber Framework
Page Object Model [POM]
Apache poi[MS Excel]
Extent Report


Project Output Files :
----------------------------------------------------------------------------------------
Refer folder reports -> myreport.html
Refer folder test-output -> SparkReport
For excel output refer folder testData -> Outputdata.xlsx


Project Output in console :
-----------------------------------------------------------------------------------------
Car Service Names : 
Snow Wash
Snow Wash + Polish
Detailing
Headlight Restoration
Wiper Fluid Refill

Car Service Amount : 
399.00
599.00
1699.00
199.00
149.00

Service Address Results For Karnataka - Mysuru : 
Karnataka - Mysuru - , Rajarajeshwari Nagar
Karnataka - Mysuru - Near Metropole Circle

Service Address Results For Delhi - Delhi :
Delhi - CC Colony - Madhav Kunj
Delhi - Nangloi - Laxmi Park
Delhi - Shastri Nagar - Near Gurudwara

Service Address Results For Telangana - Hyderabad :
Telangana - Hyderabad - Botanical Garden Road
Telangana - Hyderabad - Kothapet
Telangana - Hyderabad - Madhura Nagar Colony
Telangana - Hyderabad - Narsingi
Telangana, Hyderabad - Sri Vivekananda Nagar

Registration Error Message For Invalid Email Input :
Please enter a valid Email Address.


Dependencies added for hackathon project :
----------------------------------------------------------------------------------------
<dependencies>
	<!--  https://mvnrepository.com/artifact/commons-io/commons-io  -->
	<dependency>
		<groupId>commons-io</groupId>
		<artifactId>commons-io</artifactId>
		<version>2.15.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.commons/commons-lang3  -->
	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-lang3</artifactId>
		<version>3.14.0</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java  -->
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.18.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.testng/testng  -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.9.0</version>
		<scope>test</scope>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.poi/poi  -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>5.2.5</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml  -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>5.2.5</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/com.aventstack/extentreports  -->
	<dependency>
		<groupId>com.aventstack</groupId>
		<artifactId>extentreports</artifactId>
		<version>5.1.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api  -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-api</artifactId>
		<version>3.0.0-beta2</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core  -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-core</artifactId>
		<version>3.0.0-beta2</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>7.16.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-junit  -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>7.16.1</version>
	<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>7.16.1</version>
		<scope>test</scope>
	</dependency>
	<!--  https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter  -->
	<dependency>
		<groupId>tech.grasshopper</groupId>
		<artifactId>extentreports-cucumber7-adapter</artifactId>
		<version>1.14.0</version>
	</dependency>
</dependencies>



