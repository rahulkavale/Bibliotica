import java.util.Date;

public class BorrowBookRegisterEntry {
    String borrowerNumber;
    Date borrowedDate;
    Date returningDate;
    Book book;
    Boolean isReturned;
    
    public BorrowBookRegisterEntry(String personRegNo,Date borrwedOn,Date toBeReturnedOn,Book book){
        this.borrowerNumber=""+personRegNo;
        this. borrowedDate=borrwedOn;
        this.returningDate=toBeReturnedOn;
        this.book=book;
        isReturned=false;
    }
    public String toString(){
        return String.format("%-7s %-15s %-15s %-10s %-5s",borrowerNumber,borrowedDate,returningDate,book,isReturned);
    }
}
