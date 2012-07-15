import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bibliotica {
    public String welcome="Welcome";
    private ArrayList<String> options=new ArrayList<String>();
    private Rack rack;
    public Bibliotica(){
        options.add(0,"View Books");
        options.add(1,"Search Book");
        options.add(2,"Reserve Book");
        options.add(3,"Check Library Number");
        options.add(4,"Exit");
        rack=new Rack();
        rack.addBook(new Book(1,"Math","Science","Ramanujan",2));
        rack.addBook(new Book(2,"Math","Science","Gauss",2));
        rack.addBook(new Book(3,"Physics","Science","Newton",2));
        rack.addBook(new Book(4,"Chemistry","Science","chandrashekharn",2));
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
    public int getUserInput() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
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
    public void searchBook(int bookNo) {
        if(rack.isBookInRack(bookNo)){
            System.out.println("Book is available");
            return;
        }
        System.out.println("Book is not available");
        return;
    }
    public Book reserveBook(int bookISBN,int personId){
        Book tempBook=rack.reserveBook(bookISBN,personId);
        if(tempBook==null){
         System.out.println("Sorry we don't have that book yet");
        return null;
        }
        return tempBook;
    }
    public boolean isBookInRack(int bookISBN){
        if(rack.isBookInRack(bookISBN)){
          return true;
        }
        return false;
    }
}
