package subway.utils;

public class ExceptionMessage {
    public static final String ERROR_INVALID_SELECT = "[ERROR] 보기의 항목 중에서 선택해주세요.";

    public static final String ERROR_NO_INPUT = "[ERROR] 입력된 값이 없습니다.";
    public static final String ERROR_HAVE_FIRST_BLANK = "[ERROR] 입력 앞에 공백이 있습니다.";
    public static final String ERROR_INVALID_LENGTH = "[ERROR] 이름은 2글자 이상이어야 합니다.";

    public static final String ERROR_NOT_AVAILABLE_STATION = "[ERROR] 해당 역은 존재하지 않습니다.";
    public static final String ERROR_DUPLICATE_STATION = "[ERROR] 중복된 역이 이미 존재합니다.";
    public static final String ERROR_STATION_IN_LINE = "[ERROR] 해당 역은 노선에 속해 있어 삭제가 불가능합니다.";

    public static final String ERROR_NOT_AVAILABLE_LINE = "[ERROR] 해당 노선은 존재하지 않습니다.";
    public static final String ERROR_DUPLICATE_LINE = "[ERROR] 중복된 노선이 이미 존재합니다.";
    public static final String ERROR_DUPLICATE_LINE_STATION = "[ERROR] 상행선과 하행선의 종점이 같습니다.";

    public static final String ERROR_NOT_INTEGER = "[ERROR] 입력하신 값은 숫자가 아닙니다.";
    public static final String ERROR_INVALID_ORDER = "[ERROR] 입력하신 구간 순서는 잘못된 순서입니다.";
    public static final String ERROR_SECTION_DUPLICATED_STATION = "[ERROR] 노선에 중복된 이름이 존재합니다.";
    public static final String ERROR_SECTION_NO_STATION = "[ERROR] 해당 노선에는 해당 역이 없습니다.";
}
