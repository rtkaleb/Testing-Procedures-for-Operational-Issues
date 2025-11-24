package com.techready.banking.model;

/**
 * Representa una solicitud bancaria con los campos requeridos por el reto.
 */
public class BankRequest {
    private final String bankCode;
    private final String branchCode;
    private final String accountNumber;
    private final String personalKey;
    private final String orderValue; // keep as String to detect non-numeric values

    public BankRequest(String bankCode, String branchCode, String accountNumber, String personalKey, String orderValue) {
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.personalKey = personalKey;
        this.orderValue = orderValue;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPersonalKey() {
        return personalKey;
    }

    public String getOrderValue() {
        return orderValue;
    }

    @Override
    public String toString() {
        return "BankRequest{" +
                "bankCode='" + bankCode + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", personalKey='" + personalKey + '\'' +
                ", orderValue='" + orderValue + '\'' +
                '}';
    }
}
