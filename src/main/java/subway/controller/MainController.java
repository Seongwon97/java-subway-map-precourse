package subway.controller;

import static subway.utils.validator.*;
import static subway.view.InputViews.getSelect;
import static subway.view.OutputViews.*;

public class MainController {
    static LineController lineController = new LineController();
    static SectionController sectionController = new SectionController();
    static StationController stationController = new StationController();

    public void run() {
        stationController.init();
        lineController.init();
        mainSelect();
    }

    private void mainSelect() {
        String select = "";
        while (!select.equals("Q")) {
            try {
                printMain();
                select = getSelect();
                checkValidMainSelection(select);
                startMainSelect(select);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void startMainSelect(String select) {
        if (select.equals("1")) {
            selectStationManage();
        }
        if (select.equals("2")) {
            selectLineManage();
        }
        if (select.equals("3")) {
            selectSectionManage();
        }
        if (select.equals("4")) {
            selectPrintAllInfo();
        }
    }

    private void selectStationManage() {
        String select = "";
        while (!select.equals("B")) {
            try {
                printManageStation();
                select = getSelect();
                checkValidStationLineSelection(select);
                startStationSelect(select);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void startStationSelect(String select) {
        if (select.equals("1")) {
            stationController.addStation();
        }
        if (select.equals("2")) {
            stationController.deleteStation();
        }
        if (select.equals("3")) {
            stationController.stationList();
        }
    }



    private void selectLineManage() {
        String select = "";
        while (!select.equals("B")) {
            try {
                printManageLine();
                select = getSelect();
                checkValidStationLineSelection(select);
                startLineSelect(select);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void startLineSelect(String select) {
        if (select.equals("1")) {
            lineController.addLine();
        }
        if (select.equals("2")) {
            lineController.deleteLine();
        }
        if (select.equals("3")) {
            lineController.lineList();
        }
    }

    private void selectSectionManage() {
        String select = "";
        while (!select.equals("B")) {
            try {
                printManageSection();
                select = getSelect();
                checkValidSectionSelection(select);
                startSectionSelect(select);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void startSectionSelect(String select) {
        if (select.equals("1")) {
            sectionController.enrollSection();
        }
        if (select.equals("2")) {
            sectionController.deleteSection();
        }
    }

    private void selectPrintAllInfo() {
        lineController.printAllInfo();
    }

}
