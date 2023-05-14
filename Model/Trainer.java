/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.Date;

import DTO.Mappers.EGender;

/**
 *
 * @author auxlu
 */
public class Trainer extends User {
    private String staffId;
    private String certification;
    private String speciality;
    private String gym;
    private double hourlyRate;
    private int yearsOfExperience;
    private Date hireDate;
    private double salary;

    public Trainer() {

    }

    public Trainer(String CPF, String username, String firstName, String lastName, String email, String password,
            String phoneNumber,
            LocalDate birthDate,
            EGender gender, String city, String state, String Country, int id, String fullName, String certification,
            String speciality, String gym, double hourlyRate,
            int yearsOfExperience) {
        this.staffId = CPF;
        this.certification = certification;
        this.speciality = speciality;
        this.gym = gym;
        this.hourlyRate = hourlyRate;
        this.yearsOfExperience = yearsOfExperience;
        this.hireDate = new Date();
        this.salary = 3000;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Trainer{" + "staffId=" + staffId + ", certification=" + certification + ", speciality=" + speciality
                + ", gym=" + gym + ", hourlyRate=" + hourlyRate + ", yearsOfExperience=" + yearsOfExperience
                + ", hireDate=" + hireDate + ", salary=" + salary + '}';
    }

}
