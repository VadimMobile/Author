public class Book {
    public String title;
    public Author author;
    public int releaseYear;
    public int pages;

    public Book(String title, Author author, int releaseYear, int pages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }
    public boolean isBig(){
        return pages > 500;
    }
    public boolean matches(String word){
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }
    public int estimatePrice(){
        int price = (int) (3 * pages * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }

}

