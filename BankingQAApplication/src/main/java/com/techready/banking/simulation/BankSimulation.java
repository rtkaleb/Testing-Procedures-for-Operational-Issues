package com.techready.banking.simulation;

import com.techready.banking.model.BankRequest;
import com.techready.banking.model.ValidationResult;
import com.techready.banking.validation.BankRequestValidator;

/**
 * Simulación simple que ejecuta tres casos: válido, inválido y límite.
 */
public class BankSimulation {
    public static void main(String[] args) {
        BankRequestValidator validator = new BankRequestValidator();

        BankRequest valid = new BankRequest("123", "1023", "9876543210", "445566", "1");
        BankRequest invalid = new BankRequest("12", "1A33", "A234567890", "123", "3");
        BankRequest boundary = new BankRequest("000", "0000", "0000000000", "000000", "1");

        runCase("Válido (TC01)", valid, validator);
        runCase("Inválido (TC05/TC03 mix)", invalid, validator);
        runCase("Límite (TC10)", boundary, validator);
    }

    private static void runCase(String label, BankRequest req, BankRequestValidator validator) {
        System.out.println("--- " + label + " ---");
        System.out.println(req);
        ValidationResult result = validator.process(req);
        if (result.isValid()) {
            System.out.println("Resultado: VÁLIDO");
        } else {
            System.out.println("Resultado: INVÁLIDO");
            result.getMessages().forEach(m -> System.out.println(" - " + m));
        }
        System.out.println();
    }
}
