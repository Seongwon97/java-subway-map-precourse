package subway.repository;

import subway.domain.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final StationRepository instance = new StationRepository();
    private static final List<Station> stations = new ArrayList<>();

    private StationRepository() {
    }

    public static StationRepository getInstance() {
        return instance;
    }

    public List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }
}
