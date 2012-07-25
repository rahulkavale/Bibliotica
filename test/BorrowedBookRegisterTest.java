import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowedBookRegisterTest {
    @Test
    public void testShowAllEntries(){
        BorrowedBooksRegister borrowedBooksRegister=new BorrowedBooksRegister();
        int year = 2003;
        int month = 12;
        int day = 12;

        int year1 = 2004;
        int month1 = 12;
        int day1 = 12;


        String date1 = year1 + "/" + month1 + "/" + day1;
        String date = year + "/" + month + "/" + day;
        Date borrowDate = null;
        Date returnDate = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            borrowDate = formatter.parse(date);
            returnDate = formatter.parse(date1);
        } catch (ParseException e) {
            System.out.println(e.toString());
        }
        Book physicsBook=new Book("1","Physics","Science","S H Gambhir");
       BorrowBookRegisterEntry borrowBookRegisterEntry=new BorrowBookRegisterEntry("111-1111",borrowDate,returnDate,physicsBook);
        borrowedBooksRegister.addEntry(borrowBookRegisterEntry);
        borrowedBooksRegister.showHistory();
    }
}
