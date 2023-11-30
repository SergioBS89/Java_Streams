package api_stream.classes;

import java.util.Arrays;

public class BankEmployee extends Person{
    private String bankDepartment;
    private boolean isManager;
    private String specialization;
    private boolean isFullTime;
    private String officeLocation;
    private int experienceYears;
    private String[] languagesSpoken;
    private String education;
    private boolean isActive;
    private String bankBranch;

    public BankEmployee(int id, String name, String lastName, String email, String phoneNumber, double salary, String bankDepartment, boolean isManager, String specialization, boolean isFullTime,
                        String officeLocation, int experienceYears, String[] languagesSpoken, String education, boolean isActive, String bankBranch) {
        super(id, name, lastName, email, phoneNumber, salary);
        this.bankDepartment = bankDepartment;
        this.isManager = isManager;
        this.specialization = specialization;
        this.isFullTime = isFullTime;
        this.officeLocation = officeLocation;
        this.experienceYears = experienceYears;
        this.languagesSpoken = languagesSpoken;
        this.education = education;
        this.isActive = isActive;
        this.bankBranch = bankBranch;
    }

    public String getBankDepartment() {
        return bankDepartment;
    }

    public void setBankDepartment(String bankDepartment) {
        this.bankDepartment = bankDepartment;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String[] getLanguagesSpoken() {
        return languagesSpoken;
    }

    public void setLanguagesSpoken(String[] languagesSpoken) {
        this.languagesSpoken = languagesSpoken;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    @Override
    public String toString() {
        return "BankEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", salary=" + getSalary() +
                ", bankDepartment='" + bankDepartment + '\'' +
                ", isManager=" + isManager +
                ", specialization='" + specialization + '\'' +
                ", isFullTime=" + isFullTime +
                ", officeLocation='" + officeLocation + '\'' +
                ", experienceYears=" + experienceYears +
                ", languagesSpoken=" + Arrays.toString(languagesSpoken) +
                ", education='" + education + '\'' +
                ", isActive=" + isActive +
                ", bankBranch='" + bankBranch + '\'' +
                '}';
    }
}
