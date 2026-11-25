package be.uantwerpen.sd.project;

import java.util.List;

public class Trip {
    private int id;
    private String name;
    private int startDate;
    private int endDate;
    private List<Traveller> travellers;
    //private List<ItineraryItem> items;

    public Trip(int id, String name, int startDate, int endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void changeId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getStartDate() {
        return startDate;
    }

    public void changeStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void changeEndDate(int endDate) {
        this.endDate = endDate;
    }
}
