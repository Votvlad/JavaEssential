package package_02;

public class Book {

    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.author = "Mark Twain";
        author.show();

        title.title = "Tom Sawyer";
        title.show();

        content.content = "adventures";
        content.show();

    }

}
