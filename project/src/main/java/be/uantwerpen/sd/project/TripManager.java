package be.uantwerpen.sd.project;

import java.util.List;

public class TripManager {
    private static volatile TripManager instance;
    private List<Trip> trips;
    private List<Traveller> travellers;

    private TripManager() { }

    public static TripManager getInstance() {
        if (instance == null) {
            synchronized (TripManager.class) {
                if (instance == null) {
                    instance = new TripManager();
                }
            }
        }
        return instance;
    }

    public void addTrip(int id, String name, int startDate, int endDate) { //creates trip object
        Trip trip = new Trip(id, name, startDate, endDate);
        trips.add(trip);
    }

    public void removeTrip(int id){ //removes trip with given id
        for (Trip trip : trips) {
            if (trip.getId() == id) {
                trips.remove(trip);
                break; //only one trip can have a given id
            }
        }
    }

    public void addTraveller(String name, int age, String contactInfo, String nationality) {
        Traveller traveller = new Traveller(name, age, contactInfo, nationality);
        travellers.add(traveller);
    }

    public void removeTraveller(String name){
        for (Traveller traveller: travellers) {
            if (traveller.getName().equals(name)) {
                travellers.remove(traveller);
                break;
            }
        }
    }
}