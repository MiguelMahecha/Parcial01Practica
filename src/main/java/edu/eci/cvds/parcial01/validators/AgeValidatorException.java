package edu.eci.cvds.parcial01.validators;

public class AgeValidatorException extends Exception {
    public static final String INVALID_AGE = "Invalid age";

    public AgeValidatorException(String msg) {
        super(msg);
    }
}
