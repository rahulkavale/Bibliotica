import java.util.*;
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

    public boolean hasBorrowedTheBook(int ISBN) {
        Iterator iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            if (((Book) iterator.next()).hasTheBookWithGivenISBN(ISBN))
                return true;
        }
        return false;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
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
