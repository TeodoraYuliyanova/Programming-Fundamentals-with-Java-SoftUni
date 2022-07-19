import java.util.*;

public class Courses {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> output = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("end")) {

            String courseName = line.split(" : ")[0];
            String studentName = line.split(" : ")[1];

            if (!output.containsKey(courseName)) {
                output.put(courseName, new ArrayList<>());
            }
            output.get(courseName).add(studentName);


            line = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : output.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());


            for (String student : entry.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }


    }
}
