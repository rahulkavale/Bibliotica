import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        for (Book book : setOfBooks) {
             book.print();
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
    public Book reserveBook(int bookISBN,String personRegNumber){
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
