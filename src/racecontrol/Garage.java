package racecontrol;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private String name;
    private List<Car> cars;

    public Garage(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void carRegistration(Car car) {
        cars.add(car);
    }
}

