package subway.domain;

import java.util.List;
import java.util.Objects;

public class Line {
    private String name;
    private StationOfLine stationList;

    public Line(String name) {
        this.name = name;
        stationList = new StationOfLine();
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public boolean hasStation(String name) {
        return stationList.hasStation(name);
    }

    public void addStation(String name, int position) {
        stationList.addStation(name, position);
    }

    public void addInitStation(String name) {
        stationList.addStationInit(name);
    }

    public int getStationSize() {
        return stationList.numOfStation();
    }

    public void deleteStation(String station) {
        stationList.removeStation(station);
    }

    public List<Station> getStationInfo() {
        return stationList.getStationList();
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

    @Override
    public String toString() {
        return "[INFO] " + this.name;
    }
}
