import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/13/12
 * Time: 6:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class person {
    private String name;
    private int registrationNo;

    private List<Book> borrowedBooks = new ArrayList<Book>();

    public person() {
        name = "";
        registrationNo = 0;

    }

    public person(String userName, int registrationNo) {
        name = userName;
        this.registrationNo = registrationNo;
    }

    public boolean checkPerson(int regNo) {
        if (registrationNo == regNo) {
            //System.out.println("Your registration id is "+registrationNo+" Thank you");
            return true;
        }
        return false;
    }

    public boolean hasBorrowedTheBook(int ISBN) {
        Iterator iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            if (((Book) iterator.next()).hasTheBookWithGivenISBN(ISBN))
                return true;
        }
        return false;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (name == ((person)other).name && registrationNo == ((person)other).registrationNo) {
            return true;
        }
        return false;
    }
}
