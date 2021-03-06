package seedu.addressbook.ui;

class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    public static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    public static final String LS = System.lineSeparator();

    public static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    public static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    /** Format of a comment input line. Comment lines are silently consumed when reading user input. */
    public static final String COMMENT_LINE_FORMAT_REGEX = "#.*";
}
