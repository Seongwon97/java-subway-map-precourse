package subway.service;

import subway.domain.Line;
import subway.domain.Station;
import subway.repository.LineRepository;
import subway.repository.StationRepository;

import java.util.List;

import static subway.utils.ExceptionMessage.*;
import static subway.utils.validator.checkValidName;

public class LineService {
    private static final LineRepository lineRepository = LineRepository.getInstance();
    private static final StationRepository stationRepository = StationRepository.getInstance();

    public void init() {
        lineRepository.addLine(new Line("2호선"));
        lineRepository.addLine(new Line("3호선"));
        lineRepository.addLine(new Line("신분당선"));
        initLineTwo();
        initLineThree();
        initLineShin();
    }

    private void initLineTwo() {
        lineRepository.addInitStation("2호선", "교대역");
        lineRepository.addInitStation("2호선", "강남역");
        lineRepository.addInitStation("2호선", "역삼역");
    }

    private void initLineThree() {
        lineRepository.addInitStation("3호선", "교대역");
        lineRepository.addInitStation("3호선", "남부터미널");
        lineRepository.addInitStation("3호선", "양재역");
        lineRepository.addInitStation("3호선", "매봉역");
    }

    private void initLineShin() {
        lineRepository.addInitStation("신분당선", "강남역");
        lineRepository.addInitStation("신분당선", "양재역");
        lineRepository.addInitStation("신분당선", "양재시민의숲역");
    }

    public void addLine(String name, String firstStation, String secondStation) {
        lineRepository.addLine(new Line(name));
        lineRepository.addInitStation(name, firstStation);
        lineRepository.addInitStation(name, secondStation);
        // 상행 하행 종점 입력 기능 넣어야 함
    }

    public void deleteLine(String name) {
        if (!lineRepository.deleteLineByName(name)) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_LINE);
        }
    }

    public List<Line> getLineList() {
        return lineRepository.lines();
    }

    public String validLineName(String name) {
        checkValidName(name);
        if (lineRepository.hasLine(new Line(name))) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_LINE);
        }
        return name;
    }

    public void validFirstStation(String name) {
        if (!stationRepository.hasStation(new Station(name))) {
            throw new IllegalArgumentException(ERROR_NOT_AVAILABLE_STATION);
        }
        checkValidName(name);
    }

    public void validSecondStation(String name1, String name2) {
        validFirstStation(name1);
        if (name1.equals(name2)) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_LINE_STATION);
        }
    }

}
