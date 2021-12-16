package subway.utils;

import static subway.utils.ExceptionMessage.*;

public class validator {
    public static void checkValidName(String name) {
        isEmpty(name);
        isFirstBlank(name);
        isValidLength(name);
    }

    private static void isEmpty(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException(ERROR_NO_INPUT);
        }
    }

    private static void isFirstBlank(String name) {
        if (name.charAt(0) == ' ') {
            throw new IllegalArgumentException(ERROR_HAVE_FIRST_BLANK);
        }
    }


    private static void isValidLength(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(ERROR_INVALID_LENGTH);
        }
    }
}
