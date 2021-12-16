package subway.repository;

import subway.domain.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static subway.utils.ExceptionMessage.ERROR_DUPLICATE_STATION;

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
        if (hasStation(station)) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_STATION);
        }
        stations.add(station);
    }

    public boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public boolean hasStation(Station station) {
        if (stations.contains(station)) {
            return true;
        }
        return false;
    }


}
