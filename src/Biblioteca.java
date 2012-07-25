import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    private String welcome="Welcome";
    private ArrayList<String> options=new ArrayList<String>();
    private Rack rack;
    private BorrowedBooksRegister borrowedBooksRegister;
    private MovieList movieList;
    public Biblioteca(){
        options.add(0,"View Books");
        options.add(1,"Search Book");
        options.add(2,"Reserve Book");
        options.add(3,"Check Library Number");
        options.add(4,"List Movies");
        options.add(5,"Exit");
        rack=new Rack();
        borrowedBooksRegister=new BorrowedBooksRegister();
        Book math=new Book("1","Mathematics","Science","Ramanujan");
        Book math1=new Book("2","Math","Science","Gauss");
        Book physics=new Book("3","Physics","Science","Newton");
        Book chemistry=new Book("4","Chemistry","Science","chandrashekharn");
        rack.addBook(math1,"1");
        rack.addBook(physics,"3");
        rack.addBook(chemistry,"4");
        rack.addBook(math,"5");
        movieList=new MovieList();
        movieList.add(new Movie("Rio","Arya","N/A"));
        movieList.add(new Movie("Ice Age","Jonathen Crow","8"));
        movieList.add(new Movie("Kung Fu Panda","Po panda","7"));
        movieList.add(new Movie("MegaMind","Metroman","7.7"));
        movieList.add(new Movie("Despicable Me","David Dawn","N/A"));
        movieList.add(new Movie("Die Hard 4","Martin James","7"));
        movieList.add(new Movie("Sneakers","Mike Rodgers","7"));
        movieList.add(new Movie("3 idiots","Vinod Chopra","N/A"));
        movieList.add(new Movie("Batman","Jack Crow","7"));
        movieList.add(new Movie("Amazing Spiderman","Rodger Nadal","6"));
        movieList.add(new Movie("Once Upon a Time in Mumbai","Imran Hashmi","4"));
        movieList.add(new Movie("Bol Bacchan","Raju Shetty","7"));
        movieList.add(new Movie("Mother India","Sanjay Datt","7"));
        movieList.add(new Movie("Munnabhai MBBS","Vinod","6.5"));
        movieList.add(new Movie("Sirf Tum","David Dhavan","9"));
    }
    public String printWelcome(){
          return welcome;
    }
    public void showOptions() {
        System.out.println("Select Your Choice");
        for (int loopCounter=0;loopCounter<options.size();loopCounter++) {
               System.out.println(loopCounter+"."+options.get(loopCounter));
        }
    }

    public void showBooks(){
        rack.showAllBook();
    }

    public void searchBook(Book book) {
           if(rack.isBookInRack(book)){
               System.out.println("Book is available");
               return;
           }
        System.out.println("Book is not available");
        return;
    }
    public void searchBook(String bookNo) {
        if(rack.isBookInRack(bookNo)){
            System.out.println("Book is available");
            return;
        }
        System.out.println("Book is not available");
        return;
    }
    public void reserveBook(String bookISBN,Person person,Date borrowDate,Date returnDate){
         Book bookToBeReserved=rack.getBook(bookISBN);
        if(bookToBeReserved==null){
            System.out.println("Sorry we don't have that book yet");
            throw new BookNotAvailableException("Sorry we don't have that book yet");
        }
        if(!person.borrowBook(bookToBeReserved,rack,borrowDate,returnDate,borrowedBooksRegister)){
         System.out.println("Sorry we don't have the book copy");
        }
        System.out.println("Enjoy the book!!!");
    }
    public boolean isBookInRack(String bookISBN){
        return rack.isBookInRack(bookISBN);
    }

    public void listMovies() {
        movieList.print();
    }

}
