import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int pouredWater = 0;

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
                 int quantityWater = Integer.parseInt(scanner.nextLine());
                 if(pouredWater + quantityWater <= capacity){
                     pouredWater += quantityWater;
                 }else if (pouredWater + quantityWater > capacity ){
                     quantityWater -= pouredWater;
                     System.out.println("Insufficient capacity!");
                 }

        }
        System.out.print(pouredWater);
    }
}
