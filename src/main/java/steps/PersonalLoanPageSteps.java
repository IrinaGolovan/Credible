package steps;

import pages.PersonalLoanPage;
import pages.PersonalLoanRequestPage;


public class PersonalLoanPageSteps {

    PersonalLoanPage personalLoanPage = new PersonalLoanPage();

    public PersonalLoanRequestPage findCreditRate(String amount){
        return personalLoanPage.enterPersonalLoanAmount(amount)
                .clickFindMyRate();
    }


}
