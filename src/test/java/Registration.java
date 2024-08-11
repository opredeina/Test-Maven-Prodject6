import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class Registration extends RegistrationPage{

  RegistrationPage registrationPage = new RegistrationPage();

  @Test
  void shouldFillSelenideRegistration() {

    registrationPage.openPage()
              .setFirstName("Olesya")
              .setLaststName("Predeina")
              .setEmail("OVpredeina@yandex.ru")
              .setGender("Female")
              .setNumber("9630069504")
              .setAddress("Галкино")
              .setSubmit("Submit")
              .checkResult("Thanks for submitting the form");

  }

}
