package com.techready.banking.validation;

import com.techready.banking.model.BankRequest;
import com.techready.banking.model.ValidationResult;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BankRequestValidator {
    private static final Pattern NUMERIC = Pattern.compile("^[0-9]+$");

    public List<String> validate(BankRequest req) {
        List<String> errors = new ArrayList<>();
        if (req == null) {
            errors.add("Request is null");
            return errors;
        }

        // Bank code: exactly 3 digits
        String bank = req.getBankCode();
        if (bank == null || bank.trim().isEmpty()) {
            errors.add("Bank code is required");
        } else if (!NUMERIC.matcher(bank).matches()) {
            errors.add("Bank code must be numeric");
        } else if (bank.length() != 3) {
            errors.add("Bank code must be 3 digits");
        }

        // Branch code: exactly 4 digits
        String branch = req.getBranchCode();
        if (branch == null || branch.trim().isEmpty()) {
            errors.add("Branch code is required");
        } else if (!NUMERIC.matcher(branch).matches()) {
            errors.add("Branch code must be numeric");
        } else if (branch.length() != 4) {
            errors.add("Branch code must be 4 digits");
        }

        // Account number: exactly 10 digits
        String acct = req.getAccountNumber();
        if (acct == null || acct.trim().isEmpty()) {
            errors.add("Account number is required");
        } else if (!NUMERIC.matcher(acct).matches()) {
            errors.add("Account number must be numeric");
        } else if (acct.length() != 10) {
            errors.add("Account number must be 10 digits");
        }

        // Personal key: exactly 6 digits
        String key = req.getPersonalKey();
        if (key == null || key.trim().isEmpty()) {
            errors.add("Personal key is required");
        } else if (!NUMERIC.matcher(key).matches()) {
            errors.add("Personal key must be numeric");
        } else if (key.length() != 6) {
            errors.add("Personal key must be 6 digits");
        }

        // Order value: allowed values 1 or 2 (numeric)
        String order = req.getOrderValue();
        if (order == null || order.trim().isEmpty()) {
            errors.add("Order value is required");
        } else if (!NUMERIC.matcher(order).matches()) {
            errors.add("Order value must be numeric");
        } else {
            try {
                int ov = Integer.parseInt(order);
                if (ov != 1 && ov != 2) {
                    errors.add("Order value must be 1 (checkbook) or 2 (statement)");
                }
            } catch (NumberFormatException ex) {
                errors.add("Order value is not a valid integer");
            }
        }

        return errors;
    }

    public ValidationResult process(BankRequest req) {
        List<String> errors = validate(req);
        return new ValidationResult(errors.isEmpty(), errors);
    }

    public boolean isValid(BankRequest req) {
        return validate(req).isEmpty();
    }
}
