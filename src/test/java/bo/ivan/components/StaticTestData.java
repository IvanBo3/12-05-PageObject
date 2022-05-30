package bo.ivan.components;

public class StaticTestData {
    public String firstName = "Ivan",
                lastName = "Ivanov",
                fullName = String.format("%s %s", firstName, lastName),
                userEmail = "ivan@ivanov.su",
                gender = "Male",
                userNumber = "8919123456",
                dayOfBirth = "07",
                monthOfBirth = "May",
                yearOfBirth = "1980",
                dateOfBirth = String.format("%s %s,%s", dayOfBirth, monthOfBirth, yearOfBirth),
                subjects = "Comp",
                hobbies = "Reading",
                picturePath = "./img/1.png",
                currentAddress = "testing str., 20",
                state = "Haryana",
                city = "Karnal";

    String[] picturePathArr = picturePath.split("/");
        public String pictureName = picturePathArr[picturePathArr.length - 1],
                practiceFormTitle = "Student Registration Form",
                resultTableTitle = "Thanks for submitting the form";


}
