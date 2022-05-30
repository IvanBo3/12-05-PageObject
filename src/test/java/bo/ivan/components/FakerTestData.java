package bo.ivan.components;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerTestData {
    Faker faker = new Faker(new Locale("en"));
    public String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            fullName = String.format("%s %s", firstName, lastName),
            userEmail = faker.internet().safeEmailAddress(),
            currentAddress = faker.address().fullAddress();
}
