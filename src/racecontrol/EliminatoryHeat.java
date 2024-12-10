package racecontrol;

import java.beans.IntrospectionException;

public class EliminatoryHeat extends Race {
    private String eliminatoryHeatName;
    private int heatingDuration;

    public EliminatoryHeat(String name, String eliminatoryHeatName, int heatingDuration) {
        super(name);
        this.eliminatoryHeatName = eliminatoryHeatName;
        this.heatingDuration = heatingDuration;
    }


    public void startDriving() {
        try {
            Thread.sleep(heatingDuration * 60 * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        while (getCar().size() > 1) {
            Car eliminatedCar = getCar().remove(0);
        }

        podium.add(getCar().get(0));
    }
}
