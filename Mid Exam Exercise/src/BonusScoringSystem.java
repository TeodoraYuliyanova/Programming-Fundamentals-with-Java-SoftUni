import com.sun.jdi.Value;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLecture = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0.0;
        int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonusCalculate = (attendances * 1.0 / numberOfLecture) * (5 + additionalBonus);

            if (bonusCalculate > maxBonus) {
                maxBonus = bonusCalculate;
                maxAttendance = attendances;
            }
        }

        //The bonus is calculated with the following formula:
        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}
