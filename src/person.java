import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String name;
    private String password;
    private String registrationNo;
    private List<Book> borrowedBooks = new ArrayList<Book>();

    public Person() {
        name = "";
        registrationNo = "000-0000";
        password="";
    }

    public Person(String userName, String registrationNo,String password) {
        name = userName;
        this.registrationNo = registrationNo;
        this.password=password;
    }

    public boolean checkPerson(String regNo,String passwd) {
        return (registrationNo.equals(regNo)&&password.equals(passwd));
    }
    public boolean checkPerson(String regNo) {
        return (registrationNo.equals(regNo));
    }

    public boolean hasBorrowedTheBook(String ISBN) {
        Iterator iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            if (((Book) iterator.next()).hasTheSameISBN(ISBN))
                return true;
        }
        return false;
    }

    public boolean borrowBook(Book book,Rack rack,Date borrowDate,Date returnDate,BorrowedBooksRegister borrowedBooksRegister) {
        rack.reserveBook(this.registrationNo,book);
        addEntry(borrowedBooksRegister,this.registrationNo,borrowDate,returnDate,book);
        return borrowedBooks.add(book);
    }
    public void addEntry(BorrowedBooksRegister borrowedBooksRegister,String personRegNumber,Date borrowDate,Date returnDate,Book book){
        borrowedBooksRegister.addEntry(new BorrowBookRegisterEntry(personRegNumber,borrowDate,returnDate,book));
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (name == ((Person)other).name && registrationNo.equals(((Person)other).registrationNo)) {
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return name+" "+registrationNo;
    }
}
