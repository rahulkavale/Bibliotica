import java.util.ArrayList;
import java.util.List;

public class BorrowedBooksRegister {
    private List<BorrowBookRegisterEntry> bookPersonRegister =new ArrayList<BorrowBookRegisterEntry>();
    public void addEntry(BorrowBookRegisterEntry bookRegisterEntry){
        bookPersonRegister.add(bookRegisterEntry);
    }
    public void showHistory(){
        for(BorrowBookRegisterEntry borrowBookRegisterEntry:bookPersonRegister){
            System.out.println(borrowBookRegisterEntry);
        }
    }
}
