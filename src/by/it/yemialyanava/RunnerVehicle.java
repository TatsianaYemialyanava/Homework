package by.it.yemialyanava;
import java.util.Scanner;

public class RunnerVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String record =scanner.nextLine();
        String [] vehicles = record.split(",");
        Garage[] garages = new Garage[vehicles.length];

        for (int i = 0; i < vehicles.length; i++) {
           String vehicle = vehicles[i];
            String[] vechileParts = vehicle.split(" ");
            String type = vechileParts[0];
            String name = vechileParts[1];
            Garage<Vehicle> garage = new Garage<>();
            garages[i] = garage;
            if (type.equalsIgnoreCase("moto")){
                Motorcycle motorcycle = new Motorcycle(name);
                garage.enter(motorcycle);
            } else if (type.equalsIgnoreCase("car")){
                Car car = new Car(name);
                garage.enter(car);
            } else {
                System.out.println("Unknown variable");
            }
        }

        for (Garage g:garages){
            System.out.println(g);
        }

    }
}
