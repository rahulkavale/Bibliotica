import java.util.*;

public class Rack {
    private Map<Book,String> setOfBooks=new HashMap<Book,String>();
    private BorrowedBooksRegister borrowedBooksRegister=new BorrowedBooksRegister();
    public void addBook(Book toBeAdded,String noOfCopies){
            setOfBooks.put(toBeAdded,noOfCopies);
    }

    public void showAllBook(){
        Iterator iterator = setOfBooks.keySet().iterator();
        System.out.println(String.format("Copies Available   ISBN  Book Name         Category         Auther"));
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            String key = setOfBooks.get(book);

            System.out.println(String.format( "%-20s %3s",key, book ));
        }
   }
    public boolean isBookInRack(String lookingForBookISBN){
        Iterator iterator = setOfBooks.keySet().iterator();
        Book currentBook=null;
        while (iterator.hasNext()) {
            currentBook = (Book)iterator.next();
            if(currentBook.hasTheSameISBN(lookingForBookISBN)){
                return true;
            }
        }
        return false;
    }
    public boolean isBookInRack(Book book){
        Iterator iterator = setOfBooks.keySet().iterator();
        Book currentBook=null;
        while (iterator.hasNext()) {
            currentBook = (Book)iterator.next();
            if(currentBook.equals(book)){
                return true;
            }
        }
        return false;
    }

    public void removeBook(Book book) {
         setOfBooks.remove(book);
    }

    public boolean areCopiesOfTheBookAreAvailable(String lookingForBookISBN) throws BookNotAvailableException{
        Iterator iterator=setOfBooks.keySet().iterator();
        Book currentBook=null;
        String key="";
        boolean weatherFoundMatch=false;
        while (iterator.hasNext()) {
            currentBook = (Book)iterator.next();
            if(currentBook.hasTheSameISBN(lookingForBookISBN)){
                weatherFoundMatch=true;
               break;
            }
        }
        if(Integer.parseInt(setOfBooks.get(currentBook))>=0&&weatherFoundMatch){
            return true;
        }
        else if(Integer.parseInt(setOfBooks.get(currentBook))<0&&weatherFoundMatch)
        {
            return false;
        }
        throw new BookNotAvailableException("Book not available in Library");
    }

    public boolean reserveBook(String personRegNumber,Book book){
            Iterator iterator=setOfBooks.keySet().iterator();
            Book currentBook=null;
            String key="";
        while (iterator.hasNext()) {
            currentBook = (Book)iterator.next();
            if(currentBook.equals(book)){
                 break;
            }
        }
        if(currentBook==null) {
             throw new BookNotAvailableException("The book not in library");
        }
        if(Integer.parseInt(setOfBooks.get(currentBook))==0){
            throw new BookCopyNotAvailableException("The book copy not in library");
        }
            setOfBooks.remove(key);
            setOfBooks.put(currentBook,new String(String.valueOf(Integer.parseInt(setOfBooks.get(currentBook)) - 1)));
            return true;
        }
    public Book getBook(String bookISBN){
        Iterator iterator=setOfBooks.keySet().iterator();
        Book currentBook=null;
        String key="";
        while (iterator.hasNext()) {
            currentBook = (Book)iterator.next();
            if(currentBook.hasTheSameISBN(bookISBN)){
                return currentBook;
            }
        }
        return null;
    }
}


