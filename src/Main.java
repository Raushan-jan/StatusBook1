public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover bookMover = new FromAvailableStatusMover();
        bookMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}