package com.techready.banking.test;

import com.techready.banking.model.BankRequest;
import com.techready.banking.model.ValidationResult;
import com.techready.banking.validation.BankRequestValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class BankRequestValidatorTest {
    private final BankRequestValidator validator = new BankRequestValidator();

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideTestCases")
    void testCases(String id, BankRequest req, boolean expectedValid) {
        ValidationResult res = validator.process(req);
        assertEquals(expectedValid, res.isValid(), () -> id + " expected valid=" + expectedValid + " but got=" + res.isValid() + " messages=" + res.getMessages());
        if (!expectedValid) {
            assertFalse(res.getMessages().isEmpty(), "Expected errors for " + id);
        }
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // TC01 valid checkbook
                Arguments.of("TC01", new BankRequest("123","1023","9876543210","445566","1"), true),
                // TC02 valid statement
                Arguments.of("TC02", new BankRequest("123","1023","1234567890","112233","2"), true),
                // TC03 invalid bank code (too short)
                Arguments.of("TC03", new BankRequest("12","1023","9876543210","445566","1"), false),
                // TC04 invalid branch (non-numeric)
                Arguments.of("TC04", new BankRequest("123","1A33","9876543210","445566","1"), false),
                // TC05 invalid account (contains letters)
                Arguments.of("TC05", new BankRequest("123","1023","A234567890","445566","1"), false),
                // TC06 invalid personal key (too short)
                Arguments.of("TC06", new BankRequest("123","1023","9876543210","123","1"), false),
                // TC07 invalid order value unsupported numeric 3
                Arguments.of("TC07", new BankRequest("123","1023","9876543210","445566","3"), false),
                // TC08 invalid order value non-numeric
                Arguments.of("TC08", new BankRequest("123","1023","9876543210","445566","A"), false),
                // TC09 multiple invalids
                Arguments.of("TC09", new BankRequest("1234","999","9876543210","445566","1"), false),
                // TC10 boundary valid zeros
                Arguments.of("TC10", new BankRequest("000","0000","0000000000","000000","1"), true),
                // TC11 empty all
                Arguments.of("TC11", new BankRequest("","","","",""), false),
                // TC12 personal key non-numeric characters
                Arguments.of("TC12", new BankRequest("123","1023","1234567890","12A456","2"), false)
        );
    }
}
