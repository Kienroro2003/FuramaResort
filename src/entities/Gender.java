package entities;

import java.util.Scanner;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");
    private static final Scanner scanner = new Scanner(System.in);

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}