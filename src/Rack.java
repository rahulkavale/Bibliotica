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
            System.out.println((Book)iterator.next());
        }
   }
    public boolean isBookInRack(int lookingForBookNo){
        for(Book book:setOfBooks){
            if(book.hasTheBookWithGivenISBN(lookingForBookNo)){
                return true;
            }
        }
        return false;
    }
    public boolean isBookInRack(Book lookingForBook){
        for(Book book:setOfBooks){
             if(book.equals(lookingForBook)){
                 return true;
             }
        }
        return false;
    }

    public boolean isBookAvailable(int bookISBN){
        Iterator iterator=setOfBooks.iterator();
        Book currBook;
        while(iterator.hasNext()){
             currBook=(Book)iterator.next();
            if(currBook.hasTheBookWithGivenISBN(bookISBN)&&currBook.areCopiesAvailable()){
                return true;
            }
        }
        return false;
    }
    public Book reserveBook(int bookISBN,int personRegNumber){
        Iterator iterator=setOfBooks.iterator();
        Book currBook;
        while(iterator.hasNext()){
            currBook=(Book)iterator.next();
            if(currBook.hasTheBookWithGivenISBN(bookISBN)&&currBook.areCopiesAvailable()){
                currBook.bookCopy();
                return currBook;
            }
        }
        return null;
    }

}
