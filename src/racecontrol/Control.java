package racecontrol;

public class Control {
    public static void main(String[] args) {
        //Registro de coches en garajes
        Garage abilleira = new Garage ("Garaje Abilleira");
        Garage llampazas = new Garage ("Garaje Llampazas");
        Car opel = new Car ("Opel", "turismo", 150,10);
        Car toyota = new Car ("Toyota","turismo", 150, 10);
        Car suzuki = new Car ("Suzuki", "todoterreno", 150, 10);

        abilleira.carRegistration(opel);
        llampazas.carRegistration(toyota);
        llampazas.carRegistration(suzuki);

        StandardRace race = new StandardRace ("Abilleira",  "Campeonato Mundial", 3);

        race.addGarage(abilleira);
        race.startStandardRace();

    }
}
