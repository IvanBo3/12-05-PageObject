package bo.ivan.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectorsTestForm {
    public SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            gender = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitForm = $("#submit"),
            titleResult = $("#example-modal-sizes-title-lg"),
            tableResponsive = $("div.table-responsive"),
            titlePracticeForm = $(".practice-form-wrapper");
}
