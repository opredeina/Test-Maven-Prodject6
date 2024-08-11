package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import java.awt.Button;

public class RegistrationPage {

  private SelenideElement firstNameInput = $("[id='firstName']"),

           lastNameInput = $("[id='lastName']"),

           userEmailInput = $("[id='userEmail']"),

           genderWrapper = $("#genterWrapper"),

           userNumberInput = $("[id='userNumber']"),

           currentAddressInput = $("[id='currentAddress']"),

           submitButton = $("#submit");


  public RegistrationPage openPage() {
    open("https://demoqa.com/automation-practice-form/");

    return this;
  }

  public RegistrationPage setFirstName(String value) {
    firstNameInput.setValue(value);

    return this;
  }

  public RegistrationPage setLaststName(String value) {
    lastNameInput.setValue(value);

    return this;
  }

  public RegistrationPage setEmail(String value) {
    userEmailInput.setValue(value);

    return this;
  }

  public RegistrationPage setGender(String value) {
    genderWrapper.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setNumber(String value) {
    userNumberInput.setValue(value);

    return this;
  }

  public RegistrationPage setAddress(String value) {
    currentAddressInput.setValue(value);

    return this;
  }

  public RegistrationPage setSubmit(String value) {
    submitButton.click();

    return this;
  }

  public RegistrationPage checkResult(String text) {
    $(".modal-header").shouldHave(text(text));

    return this;
  }
}
