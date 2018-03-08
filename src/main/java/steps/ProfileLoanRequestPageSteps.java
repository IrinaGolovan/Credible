package steps;

import data.dataExtraction.ProfileData;
import pages.ProfileLoanRequestPage;
import pages.RequestRatesPage;


public class ProfileLoanRequestPageSteps {

    ProfileLoanRequestPage profileLoanRequestPage = new ProfileLoanRequestPage();

    public RequestRatesPage enterProfileLoanRequestPage(ProfileData profileData){
        return profileLoanRequestPage
                .typeFirstName(profileData.getFirstName())
                .typeLastName(profileData.getLastName())
                .typePhoneNumber(profileData.getPhoneNumber())
                .selectHousingStatus(profileData.getHousingStatus())
                .typePermanentAddress(profileData.getPermanentAddress())
                .selectCitizenshipStatus(profileData.getCitizenshipStatus())
                .typeSocialSecurityNumber(profileData.getSocialSecurityNumber())
                .typeEmail(profileData.getEmail())
                .typePassword(profileData.getPassword())
                .clickAgreeAndFindRates();
    }

}
