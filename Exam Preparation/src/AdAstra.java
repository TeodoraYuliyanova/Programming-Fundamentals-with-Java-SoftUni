
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    static class Food {
        String itemName;
        String expirationDate;
        int calories;

        public Food(String itemName, String expirationDate, int calories) {
            this.itemName = itemName;
            this.expirationDate = expirationDate;
            this.calories = calories;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

       @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d" , this.itemName , this.expirationDate, this.calories);
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([#|])(?<itemName>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1";
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<Food> foodList = new LinkedList<>();

        while (matcher.find()){
            String itemName = matcher.group("itemName");
            String expDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food food = new Food(itemName, expDate, calories);
            foodList.add(food);
        }

        int resultCalories = foodList.stream().mapToInt(Food::getCalories).sum() / 2000;

        System.out.printf("You have food to last you for: %d days!%n" , resultCalories);
        foodList.forEach(System.out::println);



    }
}
