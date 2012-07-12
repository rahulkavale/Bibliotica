import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rack {
    private List<Book> setOfBooks=new ArrayList<Book>();
    public void addBook(Book toBeAdded){
            setOfBooks.add(toBeAdded);
    }
    public void removeBook(Book bookToBeRemoved){
            if(setOfBooks.contains(bookToBeRemoved))
                setOfBooks.remove(bookToBeRemoved);
    }
    public void showAllBook(){
        Iterator iterator=setOfBooks.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
   }
    public boolean isBookInRack(int bookNo){
       Iterator iterator=setOfBooks.iterator();
        while(iterator.hasNext()){
            if(((Book)iterator.next()).hasTheBookWithGivenISBN(bookNo))
                return true;
        }
        return false;
    }
    public boolean isBookInRack(Book book){
        Iterator iterator=setOfBooks.iterator();
        while(iterator.hasNext()){
            if(((Book)iterator.next()).equals(book))
                return true;
        }
        return false;
    }


}
