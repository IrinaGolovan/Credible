package pages;

import org.openqa.selenium.By;
import webcomponents.Link;


public class MainMenuPage {

    private Link personal_loans = new Link(By.xpath(".//a[@href='/personal-loan']"));

    public PersonalLoanPage getPersonalLoanPage(){
        personal_loans.waitForElementToBeClickable(50);
        personal_loans.click();
        return new PersonalLoanPage();
    }

}

