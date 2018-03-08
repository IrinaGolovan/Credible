package tests.mainpagetests;

import data.TestsData;
import data.dataExtraction.LoanPurposeRequestData;
import data.dataExtraction.ProfileData;
import data.dataExtraction.UserData;
import org.testng.annotations.DataProvider;
import utils.StringUtils;


public class MainPageDataProvider extends TestsData{

    @DataProvider(name = "BasePageTest")
    public static Object[][] testCreditScoreEstimation(){
        UserData userData = new UserData();
        userData.setLoan(TestsData.getLoanAmount());
        LoanPurposeRequestData loanPurposeRequestData = new LoanPurposeRequestData();
        loanPurposeRequestData.setLoan_purpose(TestsData.getLoanPurpose());
        loanPurposeRequestData.setHighest_level_of_completed_education(TestsData.getHighestLevelOfCompletedEducation());
        loanPurposeRequestData.setCurrect_employment_status(TestsData.getCurrentEmploymentStatus());
        loanPurposeRequestData.setDate_of_birth(TestsData.getDateOfBirth());
        loanPurposeRequestData.setAnnual_income(TestsData.getAnnualIncome());
        loanPurposeRequestData.setEstimate_credit_score(TestsData.getCreditScore());
        ProfileData profileData = new ProfileData();
        profileData.setFirstName(TestsData.getFirstName());
        profileData.setLastName(TestsData.getLastName());
        profileData.setPhoneNumber(TestsData.getPhoneNumber());
        profileData.setHousingStatus(TestsData.getHousingStatus());
        profileData.setPermanentAddress(TestsData.getPermanentAddress());
        profileData.setCitizenshipStatus(TestsData.getCitizenshipStatus());
        profileData.setSocialSecurityNumber(TestsData.getSocialSecurityNumber());
        profileData.setEmail(StringUtils.generateEmail(TestsData.getEmail(), "@gmail.com"));
        profileData.setPassword(TestsData.getPassword());
        return new Object[][]{{userData, loanPurposeRequestData, profileData}};
    }

}
