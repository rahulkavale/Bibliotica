import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args){
        PersonRegister personRegister=new PersonRegister();
        personRegister.addPerson("Rahul",1);
        personRegister.addPerson("Rodger",2);
        Bibliotica bibliotica=new Bibliotica();
        int userChoice=-1;
        while (true){
            System.out.println(bibliotica.printWelcome());
            bibliotica.showOptions();
            try{
            userChoice=bibliotica.getUserInput();
            }catch (Exception exception){
                exception.printStackTrace();
            }
            switch (userChoice){
                case 0:
                    bibliotica.showBooks();
                    break;
                case 1:
                    System.out.println("Enter the ISBN number");
                    bibliotica.searchBook(MainClass.getUserInput());
                     break;
                case 2:
                    System.out.println("Enter the ISBN number of the book to be reserved");
                    int bookNo=MainClass.getUserInput();
                    if(bibliotica.isBookInRack(bookNo)){
                         System.out.println("Enter your registration number");
                         int userRegNo=MainClass.getUserInput();
                         Book useRequestedBook=bibliotica.reserveBook(bookNo,userRegNo);
                        person currPerson=personRegister.getPersonObject(userRegNo);
                        if(currPerson!=null&&useRequestedBook!=null){
                        personRegister.addBooksForAPerson(userRegNo,useRequestedBook);
                        System.out.println("Thank You.Enjoy the book!");
                         }
                        System.out.println("Sorry book not available");

                     }

                    break;
                case 3:
                    System.out.println("Enter your registration number");
                    int userRegNo=MainClass.getUserInput();
                    personRegister.isAValidMember(userRegNo);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the Valid choice");

            }

        }

    }
    public static int getUserInput(){
        int userInput=0;
        try{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        userInput=Integer.parseInt(bufferedReader.readLine());
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return userInput;
        }

    }