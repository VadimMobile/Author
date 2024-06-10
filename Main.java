public class Main {
    public static void main(String[] args) {
        Book book = new Book("Изучаем Java", new Author("Сьерра",  "Кэти",10), 2012, 720);

        System.out.println(book.isBig());
        System.out.println(book.matches("Java"));
        System.out.println(book.estimatePrice());
    }
}