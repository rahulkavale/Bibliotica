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
    private String registrationDate;
    private List<Book> borrowedBooks=new ArrayList<Book>();

    public person(){
        name="";
        registrationNo=0;
        registrationDate=null;
    }
    public person(String userName,int registrationNo,String registrationDate){
        name=userName;
        registrationNo=registrationNo;
        registrationDate=registrationDate;
    }
    public void checkPerson(){
         if(registrationNo<0)
             System.out.println("Please talk to Librarian. Thank you");
    }
    public boolean hasBorrowedTheBook(int ISBN){
        Iterator iterator=borrowedBooks.iterator();
        while(iterator.hasNext()){
            if(((Book)iterator.next()).hasTheBookWithGivenISBN(ISBN))
                return true;
        }
        return false;
    }

}
