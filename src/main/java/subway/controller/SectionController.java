package subway.controller;

import subway.service.SectionManageService;

import static subway.view.InputViews.*;


public class SectionController {
    static SectionManageService sectionService = new SectionManageService();

    public void enrollSection() {
        String lineName = getEnrollLineName();
        String stationName = getEnrollStationName(lineName);
        int order = getOrder(lineName);
        sectionService.enrollSection(lineName,stationName, order);
    }

    public String getEnrollLineName() {
        while (true) {
            try {
                String lineName = getEnrollSectionLine();
                sectionService.validLineName(lineName);
                return lineName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getEnrollStationName(String lineName) {
        while (true) {
            try {
                String stationName = getEnrollSectionStation();
                sectionService.validEnrollStationName(stationName);
                sectionService.validDuplicateStation(lineName, stationName);
                return stationName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getOrder(String lineName) {
        while (true) {
            try {
                String order = getEnrollSectionOrder();
                return sectionService.validOrder(order, lineName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void deleteSection() {
        String lineName = getDeleteLineName();
        String stationName = getDeleteStationName(lineName);
        sectionService.deleteSection(lineName, stationName);
    }

    public String getDeleteLineName() {
        while (true) {
            try {
                String lineName = getDeleteSectionLine();
                sectionService.validLineName(lineName);
                return lineName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getDeleteStationName(String lineName) {
        while (true) {
            try {
                String stationName = getDeleteSectionStation();
                sectionService.validDeleteStationName(lineName, stationName);
                return stationName;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
