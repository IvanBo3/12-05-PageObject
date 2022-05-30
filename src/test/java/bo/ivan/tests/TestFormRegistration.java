package bo.ivan.tests;

import bo.ivan.components.TestDataStatic;
import bo.ivan.pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class TestFormRegistration {
    RegistrationPage registrationPage = new RegistrationPage();
    TestDataStatic dataStatic = new TestDataStatic();

    @BeforeAll
    static void baseStartPage () {
        Configuration.baseUrl = "https://demoqa.com";
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");
    }

    @Test
    void formTest () {
        registrationPage
                .openStartPage()
                .setFirstName(dataStatic.firstName)
                .setLastName(dataStatic.lastName)
                .setEmail(dataStatic.userEmail)
                .setGender(dataStatic.gender)
                .setNumber(dataStatic.userNumber)
                .setBirthDay(dataStatic.dayOfBirth, dataStatic.monthOfBirth, dataStatic.yearOfBirth)
                .setSubject(dataStatic.subjects)
                .setHobbies(dataStatic.hobbies)
                .uploadPicture(dataStatic.picturePath)
                .setCurrentAddress(dataStatic.currentAddress)
                .setState(dataStatic.state)
                .setCity(dataStatic.city)
                .submitForm();

        //asserts
        registrationPage
                .checkTitle(dataStatic.resultTableTitle)
                .checkResult("Student Name", dataStatic.fullName)
                .checkResult("Student Email", dataStatic.userEmail)
                .checkResult("Gender", dataStatic.gender)
                .checkResult("Mobile", dataStatic.userNumber)
                .checkResult("Date of Birth", dataStatic.dateOfBirth)
                .checkResult("Subjects", dataStatic.subjects)
                .checkResult("Hobbies", dataStatic.hobbies)
                .checkResult("Picture", dataStatic.pictureName)
                .checkResult("Address", dataStatic.currentAddress)
                .checkResult("State and City", dataStatic.state + " " + dataStatic.city);
    }
}
