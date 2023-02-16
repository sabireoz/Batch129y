package MiniBookStore;

public class Book extends Product {


    //1-b;kitap oz product oz+authorNmae,publisher,isbn
   private  String authorName;
   private  String publisher;
   private  String isbn;

    public Book(int id, String name, String price, int stok, String authorName, String publisher, String isbn) {
        super(id, name, price, stok);//super babaya git demek
        this.authorName = authorName;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
