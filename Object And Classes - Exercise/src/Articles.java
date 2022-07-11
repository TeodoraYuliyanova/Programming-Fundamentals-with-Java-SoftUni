import java.util.Scanner;

public class Articles {

    static class Article {

        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input[] = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(": ");

            switch (data[0]) {

                case "Edit":
                    article.setContent(data[1]);
                    break;

                case "ChangeAuthor":
                    article.setAuthor(data[1]);
                    break;

                case "Rename":
                    article.setTitle(data[1]);
                    break;
            }

        }

        System.out.println(article.toString());

    }
}
