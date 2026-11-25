package be.uantwerpen.sd.project;

public class ItineraryItem {
    private int id;
    private String title;
    private int price;
    private int date;
    private String description;
    private String location;

    public ItineraryItem(int id, String title, int price, int date, String description, String location) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.date = date;
        this.description = description;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void changeId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void changePrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void changeDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void changeDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void changeLocation(String location) {
        this.location = location;
    }
}
