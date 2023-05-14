/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DTO.Mappers.EGender;
import Model.Manager;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author auxlu
 */
public class ManagerController {
     Manager manager = new Manager();

     public String addClient(String CPF, String username, String firstName, String lastName, String email,
               String password,
               String phoneNumber,
               LocalDate birthDate, EGender gender, String city, String state,
               String country, String occupation, double income, String cardHolderName, String cardNumber,
               String expirationDate, String securityCode, String billingAddress, List<String> hobbies) {
          manager.setCPF(CPF);
          manager.setUsername(username);
          manager.setFirstName(firstName);
          manager.setLastName(lastName);
          manager.setEmail(email);
          manager.setPassword(password);
          manager.setPhoneNumber(phoneNumber);
          manager.setBirthDate(birthDate);
          manager.setGender(gender);
          manager.setCity(city);
          manager.setState(state);
          manager.setCountry(country);

          String lineSeparator = System.getProperty("line.separator");
          String delimiter = ",";
          String content = "CPF" + CPF + "Username" + delimiter + "First name" + delimiter + "Last name" + delimiter
                    + "Email"
                    + delimiter + "Password" + delimiter + "Phone number" + delimiter + "Birth date" + delimiter
                    + "Gender" + delimiter + "City" + delimiter + "State" + delimiter + "Country" 
                    + lineSeparator;
          content += String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s", manager.getCPF(), delimiter,
                    manager.getUsername(), delimiter, manager.getFirstName(), delimiter, manager.getLastName(), delimiter,
                    manager.getEmail(), delimiter,
                    manager.getPassword(), delimiter, manager.getPhoneNumber(), delimiter, manager.getBirthDate(),
                    delimiter, manager.getGender(), delimiter,
                    manager.getCity(), delimiter, manager.getState(), delimiter, manager.getCountry(), delimiter
                   , lineSeparator);

          return content;
     }
}
