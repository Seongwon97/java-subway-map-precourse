package subway.service;

import subway.domain.Line;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.StationRepository;

import static subway.utils.ExceptionMessage.*;
import static subway.utils.validator.isDigit;

public class SectionManageService {
    private static final LineRepository lineRepository = LineRepository.getInstance();
    private static final StationRepository stationRepository = StationRepository.getInstance();

    public void validLineName(String name) {
        if (!lineRepository.hasLine(new Line(name))) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_LINE);
        }
    }

    public void validEnrollStationName(String stationName) {
        if (!stationRepository.hasStation(new Station(stationName))) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_STATION);
        }
    }

    public void validDeleteStationName(String lineName, String stationName) {
        if (!stationRepository.hasStation(new Station(stationName))) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_STATION);
        }
        if (!lineRepository.hasLineOfStation(lineName, stationName)) {
            throw new IllegalArgumentException(ERROR_SECTION_NO_STATION);
        }
    }

    public void validDuplicateStation(String lineName, String stationName) {
        if (lineRepository.hasLineOfStation(lineName, stationName)) {
            throw new IllegalArgumentException(ERROR_SECTION_DUPLICATED_STATION);
        }
    }

    public int validOrder(String input, String lineName) {
        int order = isDigit(input);
        if (1 > order || order > lineRepository.getLineStationSize(lineName) + 1) {
            throw new IllegalArgumentException(ERROR_INVALID_ORDER);
        }
        return order;
    }

    public void enrollSection(String line, String station, int order) {
        lineRepository.addStation(line, station, order);
    }

    public void deleteSection(String line, String station) {
        lineRepository.deleteStation(line, station);
    }


}
