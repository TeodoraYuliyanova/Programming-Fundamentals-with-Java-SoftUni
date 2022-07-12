import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {
        String name;
        String id;
        int age;

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split(" ");

            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, id, age);
            personList.add(person);


            input = scanner.nextLine();
        }

        personList.stream().sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(person -> System.out.println(person.toString()));
    }
}
