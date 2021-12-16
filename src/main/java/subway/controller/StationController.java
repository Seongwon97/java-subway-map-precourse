package subway.controller;

import subway.domain.Station;
import subway.service.StationService;

import static subway.utils.validator.checkValidName;
import static subway.view.InputViews.getAddStation;
import static subway.view.InputViews.getDeleteStation;
import static subway.view.OutputViews.*;

public class StationController {
    static StationService stationService = new StationService();

    public void init() {
        stationService.init();
    }

    public void addStation() {
        boolean flag = false;
        while (!flag) {
            try {
                stationService.addStation(getAddStation());
                flag = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        printAddStationResult();
    }

    public void deleteStation() {
        boolean flag = false;
        while (!flag) {
            try {
                stationService.deleteStation(getDeleteStation());
                flag = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        printDeleteStationResult();
    }

    public void stationList() {
        printStationList(stationService.getAllStationInfo());
    }
}
