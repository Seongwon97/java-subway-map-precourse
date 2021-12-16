package subway.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StationOfLine {
    private List<Station> stationOfLine;

    public StationOfLine() {
        stationOfLine = new ArrayList<>();
    }

    public List<Station> getStationList() {
        return Collections.unmodifiableList(stationOfLine);
    }

    public boolean hasStation(String name) {
        return stationOfLine.contains(new Station(name));
    }

    public int getStationPosition(String name) {
        return stationOfLine.indexOf(new Station(name));
    }

    public int numOfStation() {
        return stationOfLine.size();
    }

    public void addStationInit(String name) {
        stationOfLine.add(new Station(name));
    }

    public void addStation(String name, int position) {
        stationOfLine.add(position, new Station(name));
    }

    public void removeStation(String name) {
        stationOfLine.remove(getStationPosition(name));
    }
}
