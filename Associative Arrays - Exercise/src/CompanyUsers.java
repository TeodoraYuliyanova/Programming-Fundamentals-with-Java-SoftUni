import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> output = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String companyName = line.split(" -> ")[0];
            String employeeID = line.split(" -> ")[1];

            if (!output.containsKey(companyName)) {
                output.put(companyName, new ArrayList<>());
                output.get(companyName).add(employeeID);
            }else {
                if (!output.get(companyName).contains(employeeID)){
                    output.get(companyName).add(employeeID);
                }
            }


            line = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : output.entrySet()) {

            List <String> temp = entry.getValue();

            System.out.printf("%s%n", entry.getKey());

            
            for (String s : temp) {
                System.out.printf("-- %s%n", s);
            }
        }

    }
}
