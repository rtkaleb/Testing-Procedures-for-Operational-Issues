package com.techready.banking.model;

import java.util.Collections;
import java.util.List;

public class ValidationResult {
    private final boolean valid;
    private final List<String> messages;

    public ValidationResult(boolean valid, List<String> messages) {
        this.valid = valid;
        this.messages = messages == null ? Collections.emptyList() : Collections.unmodifiableList(messages);
    }

    public boolean isValid() {
        return valid;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "valid=" + valid +
                ", messages=" + messages +
                '}';
    }
}
