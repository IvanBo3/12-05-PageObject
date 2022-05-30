package bo.ivan.components;

import static com.codeborne.selenide.Selenide.$;

public class BirthdayCalendar {
    public void setBirthday (String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthOfBirth);
        $(".react-datepicker__year-select").selectOption(yearOfBirth);
        $(".react-datepicker__day--0" + dayOfBirth + ":not(.react-datepicker__day--outside-month)").click();
    }
}
