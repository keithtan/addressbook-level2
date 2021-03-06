package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's email in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValid(String)}
 */
public class Email extends Contact implements Printable {

    public static final String EXAMPLE = "valid@e.mail";
    public static final String MESSAGE_CONSTRAINTS =
            "Person emails should be 2 alphanumeric/period strings separated by '@'";
    public static final String EMAIL_VALIDATION_REGEX = "[\\w\\.]+@[\\w\\.]+";

    /**
     * Validates given email.
     *
     * @throws IllegalValueException if given email address string is invalid.
     */
    public Email(String email, boolean isPrivate) throws IllegalValueException {
        super(email, isPrivate);
        if (!isValid(email)) {
            throw new IllegalValueException(MESSAGE_CONSTRAINTS);
        }
    }

    /**
     * Returns true if the given string is a valid person email.
     */
    public boolean isValid(String test) {
        return test.matches(EMAIL_VALIDATION_REGEX);
    }

    @Override
    public String getPrintableString() {
        return "Email: " + this.value;
    }
}