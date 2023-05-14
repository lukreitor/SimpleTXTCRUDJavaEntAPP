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
public class Manager extends User {
    private String staffId;
    private Date hireDate;
    private double salary;
    private String gym;

    public Manager() {

    }

    public Manager(String CPF, String username, String firstName, String lastName, String email, String password,
            String phoneNumber,
            LocalDate birthDate,
            EGender gender, String city, String state, String Country, String gym) {
        super(CPF, username, firstName, lastName, email, password, phoneNumber, birthDate, gender, city, state,
                Country);
        this.hireDate = new Date();
        this.staffId = CPF;
        this.salary = 5000;
        this.gym = gym;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGym() {
        return gym;
    }
}
