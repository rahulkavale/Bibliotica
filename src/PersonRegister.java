import java.util.ArrayList;
import java.util.List;

public class PersonRegister {
    private List<Person> registerOfPersons=new ArrayList<Person>();
    public boolean isAValidMember(String regId,String password){
        for(Person currPerson:registerOfPersons){
             if(currPerson.checkPerson(regId,password)){
               return true;
             }
        }
        System.out.println("Please talk to Librarian. Thank you");
        return false;
    }
    public void addPerson(String name,String no,String password){
        registerOfPersons.add(new Person(name,no,password));
    }
    public void addPerson(Person currPerson){
        registerOfPersons.add(currPerson);
    }
//    public void addBooksForAPerson(String personRegId, Book book){
//        for(Person currPerson:registerOfPersons){
//            if(currPerson.checkPerson(personRegId)){
//                currPerson.borrowBook(book);
//            }
//        }
//    }
    public Person getPersonObject(String personRegId){
        for(Person currPerson:registerOfPersons){
            if(currPerson.checkPerson(personRegId)){
                return currPerson;
            }
        }
        return null;
    }
}
