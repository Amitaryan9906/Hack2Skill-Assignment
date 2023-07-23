
# Heroku web App Testing

This project focuses on conducting comprehensive testing of the Heroku web app. The aim is to ensure its functionality. The project includes activities such as  functional testing report, and a final test summary report.

### Contents

1. [Project Description](#project-description)
2. [Requrements](#Requirements)
3. [Running Test](#Running-test-with-testNG)
4. [Getting Started](#Getting-Started)
5. [Screenshots](#Screenshots)
6. [License](#license)

### Project Description
The objective of this project is to create an automated web application deployed on Heroku that performs file upload testing and identifies broken images without manual intervention. The app will streamline the process of checking uploaded files, ensuring they are functional and not corrupted.



### Features

Automated File Upload Testing: The Heroku web app will automate the process of file uploading. Users can trigger the automated tests by submitting a file through the application interface.

File Validation: The app will validate the uploaded files to ensure they meet the required criteria, such as file type, size, and format. Any invalid files will be rejected automatically.

Broken Image Detection: After the file is uploaded, the application will perform automated image integrity checks to identify broken or corrupted images. It will flag any images that fail the validation process.

Detailed Error Reporting: The app will provide detailed error reports for any failed tests, indicating the reason for the failure. This will aid users in understanding why their file uploads were not successful.

User-Friendly Interface: The Heroku web app will have an intuitive and user-friendly interface, allowing users to easily upload files and view the test results.

Scalability and Performance: The application will be designed to handle multiple file uploads concurrently without compromising performance or accuracy.

Real-Time Notifications: Users will receive real-time notifications on the success or failure of their file uploads and broken image detection, ensuring immediate awareness of any issues.

Logging and Analytics: The app will incorporate logging and analytics functionalities to keep track of uploaded files, test results, and application performance.


## Requirements


1. Java Development Kit (JDK) 
2. Maven 
3. Web Browsers (Chrome, Firefox, etc.)
4. WebDriver executables (e.g., ChromeDriver, GeckoDriver) for each browser


## Getting Started

Clone this repository to your local machine.
Set up the required WebDriver executables and update their paths in the test scripts.
Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
Run the tests using Maven or your IDE's test runner.

## For testing "upload any file"
1. Go to ```src/main/java/utils/Constants.java```.
2. Use ```String url="http://the-internet.herokuapp.com/upload"``` , and comment other url.
3. Go to ```src/test/java/qa.test/TestCase1.java```
4.  In```testUploadAnyFile()``` method change enabled ```false``` to ```true``` like  ```@Test(priority = 2,enabled = true)```.
5. and run the project

## For testing "Validate Broken Image"
1. Go to ```src/main/java/utils/Constants.java```.
2. Use ```String url="https://the-internet.herokuapp.com/broken_images"``` , and comment other url.
3. Go to ```src/test/java/qa.test/TestCase1.java```
4.  In ```validateBrokenImages()``` method change enabled ```false``` to ```true``` like  ```@Test(priority = 1,enabled = true)```.
5. and run the project
6. 
## Running Test with Maven
mvn test

## Running test with testNG

* Right click on testng.xml
* Click on the "testNG Suit"

## Additional Notes
* Update the browser driver paths in the test scripts based on your system configuration.
* Add more test classes and test cases as needed.
* Use the reporting plugin (e.g., Surefire, Allure) to generate test reports.





## Screenshots

![App Screenshot](https://github.com/Amitaryan9906/Hack2Skill-Assignment/blob/master/Automation%20Report%20-%20Google%20Chrome%2019-07-2023%2017_05_48.png?raw=true)

![App Screenshot](https://github.com/Amitaryan9906/Hack2Skill-Assignment/blob/master/Automation%20Report%20-%20Google%20Chrome%2019-07-2023%2017_11_18.png?raw=true)



## License

[MIT](https://choosealicense.com/licenses/mit/)

This project is licensed under the MIT License.

# Hack2Skill web app manual testing project link-
https://docs.google.com/spreadsheets/d/1QVGgImwSpuB1vfmYQglZ66p8NwNN5Dl8bnQfaTwRLBs/edit?usp=sharing
