package data;

import java.io.*;
import java.util.Properties;


public abstract class TestsData {

    private static String loanAmount;
    private static String loanPurpose;
    private static String highestLevelOfCompletedEducation;
    private static String currentEmploymentStatus;
    private static String dateOfBirth;
    private static String annualIncome;
    private static String creditScore;
    private static String firstName;
    private static String lastName;
    private static String phoneNumber;
    private static String housingStatus;
    private static String permanentAddress;
    private static String citizenshipStatus;
    private static String socialSecurityNumber;
    private static String email;
    private static String password;

    static{
        try {
            File file = new File("D:\\Credible_Task\\src\\main\\resources\\config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties property = new Properties();
            property.load(fileInput);
            loanAmount = property.getProperty("loanAmount");
            loanPurpose = property.getProperty("loanPurpose");
            highestLevelOfCompletedEducation = property.getProperty("highestLevelOfCompletedEducation");
            currentEmploymentStatus = property.getProperty("currentEmploymentStatus");
            dateOfBirth = property.getProperty("dateOfBirth");
            annualIncome = property.getProperty("annualIncome");
            creditScore = property.getProperty("creditScore");
            firstName = property.getProperty("firstName");
            lastName = property.getProperty("lastName");
            phoneNumber = property.getProperty("phoneNumber");
            housingStatus = property.getProperty("housingStatus");
            permanentAddress = property.getProperty("permanentAddress");
            citizenshipStatus = property.getProperty("citizenshipStatus");
            socialSecurityNumber = property.getProperty("socialSecurityNumber");
            email = property.getProperty("email");
            password = property.getProperty("password");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLoanAmount() {
        return loanAmount;
    }

    public static String getLoanPurpose() {
        return loanPurpose;
    }

    public static String getHighestLevelOfCompletedEducation() {
        return highestLevelOfCompletedEducation;
    }

    public static String getCurrentEmploymentStatus() {
        return currentEmploymentStatus;
    }

    public static String getDateOfBirth() {
        return dateOfBirth;
    }

    public static String getAnnualIncome() {
        return annualIncome;
    }

    public static String getCreditScore() {
        return creditScore;
    }

    public static String getFirstName() { return firstName; }

    public static String getLastName() { return lastName; }

    public static String getPhoneNumber() { return phoneNumber; }

    public static String getHousingStatus() { return housingStatus; }

    public static String getPermanentAddress() { return permanentAddress; }

    public static String getCitizenshipStatus() { return citizenshipStatus; }

    public static String getSocialSecurityNumber() { return socialSecurityNumber; }

    public static String getEmail() { return email; }

    public static String getPassword() { return password; }
}
