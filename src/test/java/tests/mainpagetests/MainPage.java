package tests.mainpagetests;

import data.BasePage;
import data.dataExtraction.LoanPurposeRequestData;
import data.dataExtraction.ProfileData;
import data.dataExtraction.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import steps.PersonalLoanPageSteps;
import steps.PersonalLoanRequestPageSteps;
import steps.ProfileLoanRequestPageSteps;


public class MainPage extends BasePage {

    @Test(dataProviderClass = MainPageDataProvider.class, dataProvider = "BasePageTest")
    public void testCreditScoreEstimation(UserData userData, LoanPurposeRequestData loanPurposeRequestData, ProfileData profileData) {
        MainMenuPage mainMenuPageSteps = new MainMenuPage();
        PersonalLoanPage personalLoanPage = mainMenuPageSteps.getPersonalLoanPage();
        Assert.assertTrue(personalLoanPage.isPersonalLoanPageAvailable(), "Cannot get Personal Loans Page");
        PersonalLoanPageSteps personalLoanPageSteps = new PersonalLoanPageSteps();
        PersonalLoanRequestPage personalLoanRequestPage = personalLoanPageSteps
                .findCreditRate(userData.getLoan());
        Assert.assertTrue(personalLoanRequestPage.isPageAvailable(), "Personal Loan Request Page is not available");
        PersonalLoanRequestPageSteps personalLoanRequestPageSteps = new PersonalLoanRequestPageSteps();
        ProfileLoanRequestPage profileLoanRequestPage = personalLoanRequestPageSteps
                .enterPersonalRequestData(loanPurposeRequestData);
        ProfileLoanRequestPageSteps profileLoanRequestPageSteps = new ProfileLoanRequestPageSteps();
        RequestRatesPage requestRatesPage = profileLoanRequestPageSteps.enterProfileLoanRequestPage(profileData);
        Assert.assertTrue(requestRatesPage.isRequestRatesPageAvailable(), "Request Rates Page is not available");
    }
}
