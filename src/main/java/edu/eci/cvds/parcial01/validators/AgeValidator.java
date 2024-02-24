package edu.eci.cvds.parcial01.validators;

public class AgeValidator {
    public static boolean Validate(int age) throws AgeValidatorException {
        if (age < 0 || age >= 150) throw new AgeValidatorException(AgeValidatorException.INVALID_AGE);

        return age < 18;
    }
}
