package subway.view;

import subway.domain.Station;

import java.util.List;
import java.util.Scanner;

public class InputViews {
    static final Scanner scanner = new Scanner(System.in);

    public static String getAddStation() {
        System.out.println("## 등록할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteStation() {
        System.out.println("## 삭제할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getAddLineName() {
        System.out.println("## 등록할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getFirstStation() {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getSecondStation() {
        System.out.println("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteLine() {
        System.out.println("## 삭제할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }
}
