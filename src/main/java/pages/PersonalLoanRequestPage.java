package pages;

import org.openqa.selenium.By;
import webcomponents.Button;
import webcomponents.DropDownList;
import webcomponents.InputBox;
import webcomponents.Tab;


public class PersonalLoanRequestPage {

    Tab personal_tab = new Tab(By.xpath(".//h2[contains(text(), 'Personal Loan Request')]"));
    DropDownList loan_purpose_dropdownlist = new DropDownList(By
            .xpath(".//*[contains(@id, 'loan_purpose') and contains(@id, 's2id')]"));
    DropDownList level_of_completed_education = new DropDownList(By
            .xpath(".//*[contains(@id, 'borrower_highest_degree_type') and contains(@id, 's2id')]"));
    DropDownList employment_status = new DropDownList(By
            .xpath(".//*[contains(@id, 'employment_status') and contains(@id, 's2id')]"));
    InputBox date_of_birthday = new InputBox(By.name("borrower_dob"));
    InputBox annual_income = new InputBox(By.name("employment_income_yearly"));
    DropDownList credit_score = new DropDownList(By
            .xpath(".//*[contains(@id, 'borrower_credit_score') and contains(@id, 's2id')]"));
    Button continue_button = new Button(By.xpath(".//button[@data-ga-action='Continue']"));

    public boolean isPageAvailable(){
        try {
            personal_tab.waitForElementToBePresent();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public PersonalLoanRequestPage selectLoanPurpose(String loanPurpose){
        loan_purpose_dropdownlist.select(loanPurpose);
        return this;
    }

    public PersonalLoanRequestPage selectLevelOfCompletedEducation(String levelOfCompletedEducation){
        level_of_completed_education.select(levelOfCompletedEducation);
        return this;
    }

    public PersonalLoanRequestPage selectEmploymentStatus(String employmentStatus){
        employment_status.select(employmentStatus);
        return this;
    }

    public PersonalLoanRequestPage selectCreditScore(String creditScore){
        credit_score.select(creditScore);
        return this;
    }

    public PersonalLoanRequestPage typeDateOfBirth(String dateOfBirth){
        date_of_birthday.typeText(dateOfBirth);
        return this;
    }

    public PersonalLoanRequestPage typeIncome(String income){
        annual_income.typeText(income);
        return this;
    }
    public ProfileLoanRequestPage clickContinue(){
        continue_button.click();
        return new ProfileLoanRequestPage();
    }
}
