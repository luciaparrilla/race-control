package racecontrol;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private String garageName;
    private List<Garage> garage;
    private List<Car> car;
    public List<Car> podium;

    public Race (String garageName){
        this.garageName = garageName;
        this.garage = new ArrayList<>();
        this.car = new ArrayList<>();
        this.podium = new ArrayList<>();
    }

    public String getGarageName() {
        return garageName;
    }

    public List<Garage> getGarage() {
        return garage;
    }

    public List<Car> getCar() {
        return car;
    }

    public List<Car> getPodium() {
        return podium;
    }

    public void addGarage (Garage garage) {
        this.garage.add(garage);

        for (Car car : garage.getCars()) {
            this.car.add(car);
        }
    }
}
