package racecontrol;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Control {
    private static final String estado = "estado_torneo.dat";
    private List<Garage> garages;
    private Tournament tournament;

    public Control() {
        garages = new ArrayList<>();
        tournament = new Tournament("");
    }

    public static void main(String[] args) {
        Control control = new Control();
        control.initializeGarages();
        control.initializeRace();
        control.raceInCourse();
        control.saveState();
    }

    private void initializeGarages() {
        // Registro de coches en garajes
        Garage garage1 = new Garage("Garaje Abilleira");
        Garage garage2 = new Garage("Garaje Llampazas");
        Garage garage3 = new Garage("Garajes Mariano");

        Car car1 = new Car("Audi", "Quattro", 250, 10);
        Car car2 = new Car("Porsche", "718 Cayman", 250, 10);
        Car car3 = new Car("Chevrolet", "Corvette", 250, 10);

        garage1.carRegistration(car1);
        System.out.println("Audi Quattro ha sido registrado en Garaje Abilleira.");
        garage2.carRegistration(car2);
        System.out.println("Porsche 718 Cayman ha sido registrado en Garaje Llampazas.");
        garage3.carRegistration(car3);
        System.out.println("Chevrolet Corvette ha sido registrado en Garajes Mariano.");

        garages.add(garage1);
        garages.add(garage2);
        garages.add(garage3);
    }

    private void initializeRace() {
        // Registro de garajes en carreras
        StandardRace standardRace1 = new StandardRace("Abilleira", "Campeonato Mundial", 3);
        for (Garage garage : garages) {
            standardRace1.addGarage(garage);
            System.out.println(garage.getName() + " compite en el Campeonato Mundial.");
        }
    }

    private void raceInCourse() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(estado))) {
            tournament = (Tournament) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el estado de la carrera.");
        }
    }

    private void saveState() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(estado))) {
            oos.writeObject(tournament);
        } catch (IOException e) {
            System.out.println("Error al guardar el estado de la carrera.");
        }
    }
}

