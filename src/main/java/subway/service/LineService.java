package subway.service;

import subway.domain.Line;
import subway.repository.LineRepository;
import subway.repository.StationRepository;

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
}
