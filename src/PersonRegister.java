import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/15/12
 * Time: 7:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonRegister {
    List<person> registerOfPersons=new ArrayList<person>();
    public boolean isAValidMember(int regId){
        for(person currPerson:registerOfPersons){
             if(currPerson.checkPerson(regId)){
               return true;
             }
        }
        System.out.println("Please talk to Librarian. Thank you");
        return false;
    }
    public void addPerson(String name,int no){
        registerOfPersons.add(new person(name,no));
    }
    public void addPerson(person currPerson){
        registerOfPersons.add(currPerson);
    }
    public void addBooksForAPerson(int personRegId,Book book){
        for(person currPerson:registerOfPersons){
            if(currPerson.checkPerson(personRegId)){
                currPerson.borrowBook(book);
            }
        }
    }
    public person getPersonObject(int personRegId){
        for(person currPerson:registerOfPersons){
            if(currPerson.checkPerson(personRegId)){
                return currPerson;
            }
        }
        return null;
    }
}
