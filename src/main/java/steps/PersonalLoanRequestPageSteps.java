package steps;

import data.dataExtraction.LoanPurposeRequestData;
import pages.PersonalLoanRequestPage;
import pages.ProfileLoanRequestPage;


public class PersonalLoanRequestPageSteps {

    PersonalLoanRequestPage personalLoanRequestPage = new PersonalLoanRequestPage();

    public ProfileLoanRequestPage enterPersonalRequestData(LoanPurposeRequestData loanPurposeRequestData){
        return personalLoanRequestPage
                .selectLoanPurpose(loanPurposeRequestData.getLoan_purpose())
                .selectLevelOfCompletedEducation(loanPurposeRequestData.getHighest_level_of_completed_education())
                .selectEmploymentStatus(loanPurposeRequestData.getCurrect_employment_status())
                .typeDateOfBirth(loanPurposeRequestData.getDate_of_birth())
                .typeIncome(loanPurposeRequestData.getAnnual_income())
                .selectCreditScore(loanPurposeRequestData.getEstimate_credit_score())
                .clickContinue();
    }
}
