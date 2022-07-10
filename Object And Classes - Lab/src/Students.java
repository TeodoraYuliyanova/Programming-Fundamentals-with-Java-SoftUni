import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {

        String firstName;
        String lastName;
        String age;
        String hometown;


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }


        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }


        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }


        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

    }




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List <Student> studentList = new ArrayList<>();

            String input = scanner.nextLine();

            while (!input.equals("end")){
                String[] data = input.split("\\s+");

                String firstName = data[0];
                String lastName = data[1];
                String age = data[2];
                String hometown = data[3];

                Student student = new Student();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);

                studentList.add(student);

                input = scanner.nextLine();
            }

            String town = scanner.nextLine();

            for(Student student : studentList){
                 if (student.getHometown().equals(town)){
                     System.out.printf("%s %s is %s years old%n" , student.getFirstName() , student.getLastName() , student.getAge());
                 }
            }
        }
    }

