package racecontrol;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Tournament implements  Serializable{
    private String name;
    private List<Car> cars;
    private List<Race> races;
    private List<Garage> garages;

    public Tournament (String name){
        this.name = name;
        this.cars = new ArrayList<>();
        this.races = new ArrayList<>();
        this.garages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Race> getRaces() {
        return races;
    }

    public List<Garage> getGarages() {
        return garages;
    }

    public void addGarage(Garage garage) {
        garages.add(garage);
    }

    public void startTournament(){
        for (Car car : cars) {
            car.startDriving();
        }
    }
}
