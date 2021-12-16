package subway.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import subway.repository.LineRepository;

import static org.junit.jupiter.api.Assertions.*;

class LineServiceTest {
    LineService lineService;

    @BeforeEach
    public void beforeEach() {
        lineService = new LineService();
        lineService.init();
    }

    @AfterEach
    public void afterEach() {
        lineService.getLineList().stream()
                .forEach(line -> System.out.println(line));
    }

    @Test
    public void addLine() {
        lineService.addLine("5호선");
    }

    @Test
    public void deleteLine() {
        lineService.deleteLine("신분당선");
    }



}