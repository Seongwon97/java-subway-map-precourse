package subway.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static subway.utils.ExceptionMessage.*;

class StationServiceTest {
    static StationService stationService;


    @BeforeEach
    public void beforeEach() {
        stationService = new StationService();
        stationService.init();
    }

//    @AfterEach
//    public void afterEach() {
//        stationService.getAllStationInfo().stream()
//                .forEach(station -> System.out.println(station));
//    }

    @Test
    public void addStationTest1() {
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> stationService.addStation("매봉역"));
        System.out.println(exception.getMessage());
        assertThat(exception.getMessage()).isEqualTo(ERROR_DUPLICATE_STATION);
    }

    @Test
    public void addStationTest2() {
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> stationService.addStation(" 기흥역"));
        System.out.println(exception.getMessage());
        assertThat(exception.getMessage()).isEqualTo(ERROR_HAVE_FIRST_BLANK);
    }

    @Test
    public void addStationTest3() {
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> stationService.addStation("역"));
        System.out.println(exception.getMessage());
        assertThat(exception.getMessage()).isEqualTo(ERROR_INVALID_LENGTH);
    }

    @Test
    public void addStationTest4() {
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> stationService.addStation(""));
        System.out.println(exception.getMessage());
        assertThat(exception.getMessage()).isEqualTo(ERROR_NO_INPUT);
    }


    @Test
    public void deleteStation2() {
        final RuntimeException exception = assertThrows(
                RuntimeException.class, () -> stationService.deleteStation("기흥역"));

        System.out.println(exception.getMessage());
        assertThat(exception.getMessage()).isEqualTo(ERROR_NOT_AVAILABLE_STATION);
    }
}