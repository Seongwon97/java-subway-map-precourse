package subway.view;

import java.util.Scanner;

public class InputViews {
    static final Scanner scanner = new Scanner(System.in);

    public static String getSelect() {
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextLine();
    }


    public static String getAddStation() {
        System.out.println("\n## 등록할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteStation() {
        System.out.println("\n## 삭제할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getAddLineName() {
        System.out.println("\n## 등록할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getFirstStation() {
        System.out.println("\n## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getSecondStation() {
        System.out.println("\n## 등록할 노선의 하행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteLine() {
        System.out.println("\n## 삭제할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getEnrollSectionLine() {
        System.out.println("\n## 노선을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getEnrollSectionStation() {
        System.out.println("\n## 역이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getEnrollSectionOrder() {
        System.out.println("\n## 순서를 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteSectionLine() {
        System.out.println("\n## 삭제할 구간의 노선을 입력하세요.");
        return scanner.nextLine();
    }

    public static String getDeleteSectionStation() {
        System.out.println("\n## 삭제할 구간의 역을 입력하세요.");
        return scanner.nextLine();
    }
}
