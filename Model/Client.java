/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.List;

import DTO.Mappers.EGender;
import DTO.Mappers.EPaymentMethod;

/**
 *
 * @author auxlu
 */
public class Client extends User {
    private String occupation;
    private double income;
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;
    private String securityCode;
    private String billingAddress;
    private EPaymentMethod paymentMethod;
    private LocalDate lastPaymentDate;
    private LocalDate nextPaymentDate;
    private double paymentAmount;
    private List<String> hobbies;

    // constructor
    public Client() {

    }

    public Client(String CPF, String username, String firstName, String lastName, String email, String password,
            String phoneNumber,
            LocalDate birthDate, EGender gender, String city, String state,
            String Country, String occupation, double income, String cardholderName, String cardNumber,
            String expirationDate, String securityCode, String billingAddress, List<String> hobbies) {
        super(CPF, username, firstName, lastName, email, password, phoneNumber, birthDate, gender,
                city, state, Country);
        this.occupation = occupation;
        this.income = income;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.billingAddress = billingAddress;
        this.hobbies = hobbies;
    }

    // getters and setters

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public EPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public LocalDate getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(LocalDate nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

}
