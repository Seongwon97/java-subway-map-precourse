package subway.service;

import subway.domain.Station;
import subway.repository.StationRepository;

import java.util.List;

import static subway.utils.validator.checkValidStationName;

public class StationManageService {

    private static StationRepository stationRepository = StationRepository.getInstance();

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

    public void registerStation(String name) {
        while (true) {
            try {
                checkValidStationName(name);
                stationRepository.addStation(new Station(name));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
