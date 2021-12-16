package subway.utils;

import java.util.Arrays;
import java.util.List;

import static subway.utils.ExceptionMessage.*;

public class validator {
    public static void checkValidMainSelection(String select) {
        List<String> candidate = Arrays.asList(new String[]{"1", "2", "3", "4", "Q"});

        if (!candidate.contains(select)) {
            throw new IllegalArgumentException(ERROR_INVALID_SELECT);
        }
    }

    public static void checkValidStationLineSelection(String select) {
        List<String> candidate = Arrays.asList(new String[]{"1", "2", "3", "B"});

        if (!candidate.contains(select)) {
            throw new IllegalArgumentException(ERROR_INVALID_SELECT);
        }
    }

    public static void checkValidSectionSelection(String select) {
        List<String> candidate = Arrays.asList(new String[]{"1", "2", "B"});

        if (!candidate.contains(select)) {
            throw new IllegalArgumentException(ERROR_INVALID_SELECT);
        }
    }

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

    public static int isDigit(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_NOT_INTEGER);
        }
    }
}
