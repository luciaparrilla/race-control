package racecontrol;

class StandardRace extends Race {
    private String standardRaceName;
    private int time;

    public StandardRace (String garageName, String standardRaceName, int time) {
        super(garageName);
        this.standardRaceName = standardRaceName;
        this.time = time;
    }


    public void startStandardRace() {
        for (int i = 0; i < time * 60; i++) {
            for (Car car : getCar()) {
                car.startDriving();
            }
        }
    }
}
