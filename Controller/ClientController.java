/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.Mappers.EGender;
import Model.Client;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author auxlu
 */
public class ClientController {
     Client client = new Client();

     public String addClient(String CPF, String username, String firstName, String lastName, String email,
               String password,
               String phoneNumber,
               LocalDate birthDate, EGender gender, String city, String state,
               String country, String occupation, double income, String cardHolderName, String cardNumber,
               String expirationDate, String securityCode, String billingAddress, List<String> hobbies) {
          client.setCPF(CPF);
          client.setUsername(username);
          client.setFirstName(firstName);
          client.setLastName(lastName);
          client.setEmail(email);
          client.setPassword(password);
          client.setPhoneNumber(phoneNumber);
          client.setBirthDate(birthDate);
          client.setGender(gender);
          client.setCity(city);
          client.setState(state);
          client.setCountry(country);
          client.setOccupation(occupation);
          client.setIncome(income);
          client.setCardholderName(cardHolderName);
          client.setCardNumber(cardNumber);
          client.setExpirationDate(expirationDate);
          client.setSecurityCode(securityCode);
          client.setBillingAddress(billingAddress);

          String lineSeparator = System.getProperty("line.separator");
          String delimiter = ",";
          String content = "CPF" + CPF + "Username" + delimiter + "First name" + delimiter + "Last name" + delimiter
                    + "Email"
                    + delimiter + "Password" + delimiter + "Phone number" + delimiter + "Birth date" + delimiter
                    + "Gender" + delimiter + "City" + delimiter + "State" + delimiter + "Country" + delimiter
                    + "Occupation" + delimiter + "Income" + delimiter + "Cardholder name" + delimiter + "Card number"
                    + delimiter + "Expiration date" + delimiter + "Security code" + delimiter + "Billing address"
                    + lineSeparator;
          content += String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s", client.getCPF(), delimiter,
                    client.getUsername(), delimiter, client.getFirstName(), delimiter, client.getLastName(), delimiter,
                    client.getEmail(), delimiter,
                    client.getPassword(), delimiter, client.getPhoneNumber(), delimiter, client.getBirthDate(),
                    delimiter, client.getGender(), delimiter,
                    client.getCity(), delimiter, client.getState(), delimiter, client.getCountry(), delimiter,
                    client.getOccupation(), delimiter,
                    client.getIncome(), delimiter, client.getCardholderName(), delimiter, client.getCardNumber(),
                    delimiter,
                    client.getExpirationDate(), delimiter, client.getSecurityCode(), delimiter,
                    client.getBillingAddress(), lineSeparator);

          return content;
     }
}
