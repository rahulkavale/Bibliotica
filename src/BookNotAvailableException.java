public class BookNotAvailableException extends RuntimeException {
    String str;
    public BookNotAvailableException(String s) {
        super(s);
        str=s;
    }
    @Override
    public String toString(){
        return "Book itself is not available in the library!!!You can inform librarian about it";
    }
}
