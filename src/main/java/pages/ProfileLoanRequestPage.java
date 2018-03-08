package pages;

import org.openqa.selenium.By;
import webcomponents.Button;
import webcomponents.DropDownList;
import webcomponents.DropDownOption;
import webcomponents.InputBox;


public class ProfileLoanRequestPage {

    InputBox firstName_InputBox = new InputBox(By.xpath(".//*[contains(@id, 'borrower_first_name')]"));
    InputBox lastName_InputBox = new InputBox(By.xpath(".//*[contains(@id, 'borrower_last_name')]"));
    InputBox primaryPhone_Number = new InputBox(By.xpath(".//*[contains(@id, 'borrower_phone')]"));
    DropDownList housing_Status = new DropDownList(By
            .xpath(".//*[contains(@id, 'expenses_housing_type') and contains(@id, 's2id')]"));
    DropDownList permanent_Address = new DropDownList(By.xpath(".//*[contains(@id, 'current_address_full_address')]"));
    DropDownOption dropDownOption = new DropDownOption(By.cssSelector(".pac-item"));
    DropDownList citizenship_Status = new DropDownList(By
            .xpath(".//*[contains(@id, 'borrower_citizenship_status') and contains(@id, 's2id')]"));
    InputBox socialSecurity_Number = new InputBox(By.xpath(".//*[contains(@id, 'borrower_ssn')]"));
    InputBox email = new InputBox(By.name("email"));
    InputBox password = new InputBox(By.name("password"));
    Button agree_and_find_rates = new Button(By.xpath(".//button[contains(text(), 'Agree and Find My Rates')]"));

    public ProfileLoanRequestPage typeFirstName(String firstName){
        firstName_InputBox.typeText(firstName);
        return this;
    }

    public ProfileLoanRequestPage typeLastName(String lastName){
        lastName_InputBox.typeText(lastName);
        return this;
    }

    public ProfileLoanRequestPage typePhoneNumber(String phoneNumber){
        primaryPhone_Number.typeText(phoneNumber);
        return this;
    }

    public ProfileLoanRequestPage selectHousingStatus(String housingStatus){
        housing_Status.select(housingStatus);
        return this;
    }

    public ProfileLoanRequestPage typePermanentAddress(String address){
        permanent_Address.typeText(address);
        dropDownOption.waitForElementToBeClickable();
        dropDownOption.click();
        return this;
    }

    public ProfileLoanRequestPage selectCitizenshipStatus(String citizenshipStatus){
        citizenship_Status.select(citizenshipStatus);
        return this;
    }

    public ProfileLoanRequestPage typeSocialSecurityNumber(String securityNumber){
        socialSecurity_Number.typeText(securityNumber);
        return this;
    }

    public ProfileLoanRequestPage typeEmail(String emailAddress){
        email.typeText(emailAddress);
        return this;
    }

    public ProfileLoanRequestPage typePassword(String userPassword){
        password.waitForElementToBeVisible(15);
        password.typeText(userPassword);
        return this;
    }

    public RequestRatesPage clickAgreeAndFindRates(){
        agree_and_find_rates.click();
        return new RequestRatesPage();
    }

}
