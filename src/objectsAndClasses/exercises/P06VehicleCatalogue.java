package objectsAndClasses.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicles.add(vehicle);
            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!line.equals("Close the Catalogue")) {
            String model = line;

            vehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            line = scanner.nextLine();
        }

        List<Vehicle> cars = vehicles.stream()
                .filter(vehicle -> vehicle.getTypeVehicle().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicles.stream()
                .filter(vehicle -> vehicle.getTypeVehicle().equals("truck"))
                .collect(Collectors.toList());

        double carsAvgHp = avgHp(cars);
        double trucksAvgHp = avgHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvgHp);
    }

    static double avgHp(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }

    static class Vehicle {
        String typeVehicle;
        String model;
        String color;
        int horsePower;

        public Vehicle(String typeVehicle, String model, String color, int horsePower) {
            this.typeVehicle = typeVehicle;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getTypeVehicle() {
            return typeVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d", getTypeVehicle().toUpperCase().charAt(0) + getTypeVehicle().substring(1),
                    this.model, this.color, this.horsePower);
        }
    }
}
