package be.uantwerpen.sd.project;

public class Traveller {
    private String name;
    private int age;
    private String contactInfo;
    private String nationality;

    public Traveller(String name, int age, String contactInfo, String nationality) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void changeContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getNationality() {
        return nationality;
    }

    public void changeNationality(String nationality) {
        this.nationality = nationality;
    }
}
