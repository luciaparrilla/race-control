package racecontrol;

public class Car {
    private String label;
    private String model;
    private int maxSpeed;


    public Car (String label, String model, int maxSpeed, int acceleration){ //int time
        this.label = label;
        this.model = model;
        this.maxSpeed = 220;

    }

    public String getLabel() {
        return label;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int startDriving () {
        int speedVariation = (int) (Math.random() * 10);
        return maxSpeed + speedVariation;
    }
}
