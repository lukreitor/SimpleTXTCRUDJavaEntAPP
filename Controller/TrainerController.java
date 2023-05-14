/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 * 
 
 */

/* 
 /*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Controller;

import DTO.Mappers.EGender;
import Model.Client;
import java.time.LocalDate;
import java.util.List;

import Model.Trainer;

/**
 *
 * @author auxlu
 */
public class TrainerController {

    Trainer trainer = new Trainer();

    public String addTrainer(String CPF, String username, String firstName, String lastName, String email,
            String password,
            String phoneNumber,
            LocalDate birthDate, EGender gender, String city, String state,
            String country, String certification, String speciality, String gym, double hourlyRate,
            int yearsOfExperience) {

        trainer.setCPF(CPF);
        trainer.setUsername(username);
        trainer.setFirstName(firstName);
        trainer.setLastName(lastName);
        trainer.setEmail(email);
        trainer.setPassword(password);
        trainer.setPhoneNumber(phoneNumber);
        trainer.setBirthDate(birthDate);
        trainer.setGender(gender);
        trainer.setCity(city);
        trainer.setState(state);
        trainer.setCountry(country);
        trainer.setCertification(certification);
        trainer.setSpeciality(speciality);
        trainer.setGym(gym);
        trainer.setHourlyRate(hourlyRate);
        trainer.setYearsOfExperience(yearsOfExperience);

        String lineSeparator = System.getProperty("line.separator");
        String delimiter = ",";
        String content = "CPF / StaffID" + CPF + "Username" + delimiter + "First name" + delimiter + "Last name"
                + delimiter + "Email"
                + delimiter + "Password" + delimiter + "Phone number" + delimiter + "Birth date" + delimiter
                + "Gender" + delimiter + "City" + delimiter + "State" + delimiter + "Country" + delimiter
                + "Certification" + delimiter + "Speciality" + delimiter + "Gym" + delimiter + "Hourly rate" + delimiter
                + "Years of experience" + lineSeparator;

        content += String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s", trainer.getCPF(), delimiter,
                trainer.getUsername(), delimiter, trainer.getFirstName(), delimiter, trainer.getLastName(), delimiter,
                trainer.getEmail(), delimiter, trainer.getPassword(), delimiter, trainer.getPhoneNumber(), delimiter,
                trainer.getBirthDate(), delimiter, trainer.getGender(), delimiter, trainer.getCity(), delimiter,
                trainer.getState(), delimiter, trainer.getCountry(), delimiter, trainer.getCertification(), delimiter,
                trainer.getSpeciality(), delimiter, trainer.getGym(), delimiter, trainer.getHourlyRate(), delimiter,
                trainer.getYearsOfExperience(), lineSeparator);

        return content;

    }

}
