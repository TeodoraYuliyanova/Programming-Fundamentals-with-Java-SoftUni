import java.util.Scanner;

public class Articles2 {


    static class Articles {
    String title;
    String content;
    String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
        return String.format("%s - %s: %s%n" , this.title, this.content, this. author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String [] line = scanner.nextLine().split(", ");
            String title = line[0];
            String content= line[1];
            String author = line[2];

            String oneOfThree = scanner.nextLine();
            Articles articles = new Articles(title, content, author);

            System.out.println(articles.toString());

        }




    }
}
