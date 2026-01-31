package dto;

import entities.CustomerType;
import entities.Gender;

public record CustomerRecord(String fullName, String dateOfBirth, Gender gender, String idCard, String phoneNumber, String email, CustomerType customerType, String address) {
}
