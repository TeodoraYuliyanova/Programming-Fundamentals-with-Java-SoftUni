import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsInfo.putIfAbsent(studentName, new ArrayList<>());
            studentsInfo.get(studentName).add(grade);
        }

        studentsInfo.entrySet().stream().forEach(entry -> {
            double avgGrade = entry.getValue().stream().mapToDouble(x -> x).average().orElse(0.0);
            if (avgGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), avgGrade);
            }
        }

        );


    }
}
