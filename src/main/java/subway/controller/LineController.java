package subway.controller;

import subway.domain.Line;
import subway.service.LineService;

import static subway.view.InputViews.*;
import static subway.view.OutputViews.printAddStationResult;
import static subway.view.OutputViews.printLineList;

public class LineController {
    static LineService lineService = new LineService();

    public void init() {
        lineService.init();
    }

    public void addLine() {
        boolean flag = false;
        while (!flag) {
            try {
                lineService.addLine(getAddLine());
                flag = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        printAddStationResult();
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
}
