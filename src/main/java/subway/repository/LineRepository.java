package subway.repository;

import subway.domain.Line;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final LineRepository instance = new LineRepository();
    private static final List<Line> lines = new ArrayList<>();

    private LineRepository() {

    }

    public static LineRepository getInstance() {
        return instance;
    }

    public List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public void addInitStation(String line, String station) {
        lines.get(findStationIndex(line)).addInitStation(station);
    }

    private int findStationIndex(String lineName) {
        return lines().indexOf(new Line(lineName));
    }

}
