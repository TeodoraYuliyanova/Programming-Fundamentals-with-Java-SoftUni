import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=\\/])(?<destinations>[A-Z][A-Za-z]{2,})\\1";

        String placesOnMap = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(placesOnMap);

        List <String> destinations = new ArrayList<>();
        int counterForTravelPoints = 0;
        while(matcher.find()){

            String destination = matcher.group("destinations");
            destinations.add(destination);
            counterForTravelPoints += destination.length();

        }


        System.out.println("Destinations: " + String.join(", " , destinations ));
        System.out.printf("Travel Points: %d" , counterForTravelPoints);


    }
}
