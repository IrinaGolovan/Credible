package data.dataExtraction;


public class LoanPurposeRequestData {

    private String loan_purpose;
    private String highest_level_of_completed_education;
    private String currect_employment_status;
    private String date_of_birth;
    private String annual_income;
    private String estimate_credit_score;

    public String getLoan_purpose() {
        return loan_purpose;
    }

    public void setLoan_purpose(String loan_purpose) {
        this.loan_purpose = loan_purpose;
    }

    public String getHighest_level_of_completed_education() {
        return highest_level_of_completed_education;
    }

    public void setHighest_level_of_completed_education(String highest_level_of_completed_education) {
        this.highest_level_of_completed_education = highest_level_of_completed_education;
    }

    public String getCurrect_employment_status() {
        return currect_employment_status;
    }

    public void setCurrect_employment_status(String currect_employment_status) {
        this.currect_employment_status = currect_employment_status;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(String annual_income) {
        this.annual_income = annual_income;
    }

    public String getEstimate_credit_score() {
        return estimate_credit_score;
    }

    public void setEstimate_credit_score(String estimate_credit_score) {
        this.estimate_credit_score = estimate_credit_score;
    }
}
