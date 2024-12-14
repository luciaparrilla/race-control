package racecontrol;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Garage implements Serializable {
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

