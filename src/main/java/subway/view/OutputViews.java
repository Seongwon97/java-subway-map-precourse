package subway.view;

import subway.domain.Line;
import subway.domain.Station;

import java.util.List;

public class OutputViews {
    public static void printMain() {
        System.out.println("\n## 메인 화면\n" +
                "1. 역 관리\n" +
                "2. 노선 관리\n" +
                "3. 구간 관리\n" +
                "4. 지하철 노선도 출력\n" +
                "Q. 종료\n");
    }

    public static void printManageStation() {
        System.out.println("\n## 역 관리 화면\n" +
                "1. 역 등록\n" +
                "2. 역 삭제\n" +
                "3. 역 조회\n" +
                "B. 돌아가기\n");
    }
    public static void printAddStationResult() {
        System.out.println("\n[INFO] 지하철 역이 등록되었습니다.");
    }

    public static void printDeleteStationResult() {
        System.out.println("\n[INFO] 지하철 역이 삭제되었습니다.");
    }

    public static void printStationList(List<Station> stations) {
        System.out.println("\n## 역 목록");
        stations.stream().forEach(station -> System.out.println(station));
    }

    public static void printManageLine() {
        System.out.println("\n## 노선 관리 화면\n" +
                "1. 노선 등록\n" +
                "2. 노선 삭제\n" +
                "3. 노선 조회\n" +
                "B. 돌아가기\n");
    }

    public static void printAddLineResult() {
        System.out.println("\n[INFO] 지하철 노선이 등록되었습니다.");
    }

    public static void printDeleteLineResult() {
        System.out.println("\n[INFO] 지하철 노선이 삭제되었습니다.");
    }

    public static void printLineList(List<Line> lines) {
        System.out.println("\n## 노선 목록");
        lines.stream().forEach(line -> System.out.println(line));
    }

    public static void printManageSection() {
        System.out.println("\n## 구간 관리 화면\n" +
                "1. 구간 등록\n" +
                "2. 구간 삭제\n" +
                "B. 돌아가기\n");
    }

    public static void printSectionEnroll() {
        System.out.println("\n[INFO] 구간이 등록되었습니다.");
    }

    public static void printSectionDelete() {
        System.out.println("\n[INFO] 구간이 삭제되었습니다.");
    }

    public static void printSubwatInfo(List<Line> lines) {
        System.out.println("\n## 지하철 노선도");
        for (Line line: lines) {
            System.out.println(line);
            System.out.println("---");
            line.getStationInfo().stream().forEach(station -> System.out.println(station));
            System.out.println();
        }
    }

}
