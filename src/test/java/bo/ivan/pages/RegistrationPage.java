package bo.ivan.pages;

import bo.ivan.components.BirthdayCalendar;
import bo.ivan.components.SelectorsTestForm;
import bo.ivan.components.StaticTestData;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    BirthdayCalendar birthdayCalendar = new BirthdayCalendar();
    SelectorsTestForm selectorsTestForm = new SelectorsTestForm();
    StaticTestData dataStatic = new StaticTestData();


    //actions
    public RegistrationPage openStartPage() {
        Selenide.open("/automation-practice-form");
//        Selenide.zoom(0.75);
        selectorsTestForm.titlePracticeForm.shouldHave(text(dataStatic.practiceFormTitle));
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        selectorsTestForm.firstName.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        selectorsTestForm.lastName.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String userEmail) {
       selectorsTestForm.userEmail.setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        selectorsTestForm.gender.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setNumber(String userNumber) {
        selectorsTestForm.userNumber.setValue(userNumber);
        return this;
    }

    public RegistrationPage setBirthDay (String day, String month, String year) {
        birthdayCalendar.setBirthday(day, month, year);
        return this;
    }

    public RegistrationPage setSubject(String subjects) {
        selectorsTestForm.subjectInput.val(subjects).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies (String hobbies) {
        selectorsTestForm.hobbiesWrapper.$(byText(hobbies)).scrollIntoView(true).click();
        return this;
    }

    public RegistrationPage uploadPicture (String picturePath) {
        selectorsTestForm.uploadPicture.uploadFromClasspath(picturePath);
        return this;
    }

    public RegistrationPage setCurrentAddress (String currentAddress) {
        selectorsTestForm.currentAddress.setValue(currentAddress);
        return this;
    }

    public RegistrationPage setState (String state) {
        selectorsTestForm.state.scrollIntoView(true).click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity (String city) {
        selectorsTestForm.city.click();
        $(byText(city)).click();
        return this;
    }

    public void submitForm() {
        selectorsTestForm.submitForm.click();
    }


    //asserts
    public RegistrationPage checkTitle(String title) {
        selectorsTestForm.titleResult.shouldHave(text(dataStatic.resultTableTitle));
        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        selectorsTestForm.tableResponsive.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}
