import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         int nSnowBalls = Integer.parseInt(scanner.nextLine());
         double max = 0;
         int snowBallSnoww = 0;
         int snowBallTimee = 0;
         int snowBallQualityy = 0;

        for (int i = 0; i < nSnowBalls; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            //(snowballSnow / snowballTime) ^ snowballQuality
            double calculate =  Math.pow((int) (snowBallSnow / snowBallTime), snowBallQuality);

            if (calculate > max){
                max = calculate;
                snowBallSnoww = snowBallSnow;
                snowBallTimee = snowBallTime;
                snowBallQualityy = snowBallQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)" , snowBallSnoww , snowBallTimee  , max , snowBallQualityy);


    }
}
