import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map <String, String> output = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String [] line = scanner.nextLine().split("\\s+");

            String regOrUnreg = line[0];


            switch (regOrUnreg){

                case "register":
                    String username = line[1];
                    String licensePlate = line[2].toUpperCase();

                    if (output.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n" , licensePlate);
                   }else {
                       output.put(username, licensePlate);
                       System.out.printf("%s registered %s successfully%n" , username, licensePlate);
                    }

                    break;


                case "unregister":
                     username = line[1];
                    if (!output.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n" , username);
                    }


                    if (output.containsKey(username)){
                        output.remove(username);
                        System.out.printf("%s unregistered successfully%n" , username);
                    }

                    break;


            }

        }

        output.forEach((k,v) -> System.out.printf("%s => %s%n" , k, v));
    }
}
