package subway.utils;

public class validator {
    public static void checkValidName(String name) {
        isEmpty(name);
        isFirstBlank(name);
        isValidLength(name);
    }

    private static void isEmpty(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 입력된 값이 없습니다.");
        }
    }

    private static void isFirstBlank(String name) {
        if (name.charAt(0) == ' ') {
            throw new IllegalArgumentException("[ERROR] 입력 앞에 공백이 있습니다.");
        }
    }


    private static void isValidLength(String name) {
        if (name.length() >= 2) {
            throw new IllegalArgumentException("[ERROR] 이름은 2글자 이상이어야 합니다.");
        }
    }
}
