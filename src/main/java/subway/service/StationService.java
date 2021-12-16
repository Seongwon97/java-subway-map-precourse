package subway.service;

import subway.domain.Station;
import subway.repository.StationRepository;

import java.util.List;

import static subway.utils.ExceptionMessage.ERROR_NOT_AVAILABLE_STATION;
import static subway.utils.validator.checkValidName;

public class StationService {

    private static final StationRepository stationRepository = StationRepository.getInstance();

    public void init() {
        stationRepository.addStation(new Station("교대역"));
        stationRepository.addStation(new Station("강남역"));
        stationRepository.addStation(new Station("역삼역"));
        stationRepository.addStation(new Station("남부터미널역"));
        stationRepository.addStation(new Station("양재역"));
        stationRepository.addStation(new Station("양재시민의숲역"));
        stationRepository.addStation(new Station("매봉역"));
    }

    public List<Station> getAllStationInfo() {
        return stationRepository.stations();
    }

    public void addStation(String name) {
        checkValidName(name);
        stationRepository.addStation(new Station(name));
    }

    public void deleteStation(String name) {
        if (!stationRepository.deleteStation(name)) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_STATION);
        }
        // 노선들에서도 역 삭제해야 함
    }


}
