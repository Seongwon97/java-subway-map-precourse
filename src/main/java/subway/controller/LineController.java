package subway.controller;

import subway.service.LineService;

import static subway.view.InputViews.*;
import static subway.view.OutputViews.*;

public class LineController {
    static LineService lineService = new LineService();

    public void init() {
        lineService.init();
    }

    public void addLine() {
        boolean flag = false;
        while (!flag) {
            try {
                String lineName = lineService.validLineName(getAddLineName());
                String firstStation = getFirstStationName();
                String secondStation = getSecondStationName(firstStation);
                lineService.addLine(lineName, firstStation, secondStation);
                flag = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        printAddStationResult();
    }

    public String getFirstStationName() {
        while (true) {
            try {
                String stationName = getFirstStation();
                lineService.validFirstStation(stationName);
                return stationName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getSecondStationName(String firstStation) {
        while (true) {
            try {
                String stationName = getSecondStation();
                lineService.validSecondStation(stationName, firstStation);
                return stationName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void deleteLine() {
        boolean flag = false;
        while (!flag) {
            try {
                lineService.deleteLine(getDeleteLine());
                flag = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        printAddStationResult();
    }

    public void lineList() {
        printLineList(lineService.getLineList());
    }

    public void printAllInfo() {
        printSubwatInfo(lineService.getLineList());
    }
}
