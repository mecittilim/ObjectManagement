public class ReaderTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Yaşar Kemal";
        book1.page = 400;
        book1.title = "Demirciler Çarşısı Cinayeti";
        book1.CurrentPage = 200;
        book1.type = "Nobel";

        Reader reader1 = new Reader();
        reader1.age = 26;
        reader1.name = "Mecit Tilim";
        reader1.sex = "Male";
        reader1.book = book1;

        Author author1 = new Author();
        author1.name = book1.author;

        System.out.println(author1.name);

        reader1.read(book1.title);


    }
}
