package subway.domain;

import java.util.Objects;

public class Line {
    private String name;
    private StationOfLine stationList;

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public boolean hasStation(String name) {
        return stationList.hasStation(name);
    }

    public void addStation(String name, int position) {
        if (hasStation(name)) {
            throw new IllegalArgumentException("[ERROR] 노선에 중복된 이름이 존재합니다.");
        }
        stationList.addStation(name, position);
    }

    public void addInitStation(String name) {
        stationList.addStationInit(name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Line))
            return false;

        return this.name.equals(((Line) obj).getName());
    }
}
