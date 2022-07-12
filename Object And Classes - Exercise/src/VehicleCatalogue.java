import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {

    static class Vehicles{
        String typeOfVehicle;
        String model;
        String color;
        int horsePower;

        public Vehicles(String typeOfVehicle, String model, String color, int horsePower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
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
                    "Horsepower: %d" , getTypeOfVehicle().toUpperCase().charAt(0) + getTypeOfVehicle().substring(1) , getModel(), getColor() , getHorsePower());
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Vehicles> vehiclesList = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")){
            String [] data = line.split("\\s+");
            String typeOfVehicle = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicles vehicles = new Vehicles(typeOfVehicle, model, color, horsePower);

            vehiclesList.add(vehicles);

            line = scanner.nextLine();
        }

        String line2 = scanner.nextLine();
        while (!line2.equals("Close the Catalogue")){

            String model = line2;
            vehiclesList.stream().filter(vehicles -> vehicles.getModel().equals(model)).forEach(vehicles -> System.out.println(vehicles.toString()));

            line2 = scanner.nextLine();
        }

        List <Vehicles> cars = vehiclesList.stream().filter(vehicles -> vehicles.getTypeOfVehicle().equals("car")).collect(Collectors.toList());
        List <Vehicles> trucks = vehiclesList.stream().filter(vehicles -> vehicles.getTypeOfVehicle().equals("truck")).collect(Collectors.toList());

          double carsAverage = averageHp(cars);
          double trucksAverage = averageHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n" , carsAverage);
        System.out.printf("Trucks have average horsepower of: %.2f." , trucksAverage);


    }

    static double averageHp (List <Vehicles> vehicles) {
        if (vehicles.size() == 0){
            return 0;
        }

       return vehicles.stream().mapToDouble(Vehicles::getHorsePower).sum() / vehicles.size();
    }
}
