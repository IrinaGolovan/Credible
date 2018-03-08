package pages;

import org.openqa.selenium.By;
import webcomponents.Button;
import webcomponents.InputBox;


public class PersonalLoanPage {

    private Button find_my_rate_button = new Button(By
            .xpath(".//*[@id='find-my-rate-form-1-desktop']//button[contains(@class, 'start hidden-xs')]"));
    private InputBox enter_amount_inputbox = new InputBox(By
            .xpath(".//div[@id='find-my-rate-form-1-desktop']//input[@name='loan_amount']"));

    public boolean isPersonalLoanPageAvailable(){
        try{
            find_my_rate_button.waitForElementToBePresent();
            return true;
        }catch(Exception e){
            e.getStackTrace();
        }
        return false;
    }

    public PersonalLoanPage enterPersonalLoanAmount(String amount){
        enter_amount_inputbox.typeText(amount);
        return this;
    }

    public PersonalLoanRequestPage clickFindMyRate(){
        find_my_rate_button.click();
        return new PersonalLoanRequestPage();
    }


}

