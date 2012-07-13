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
        Bibliotica bibliotica=new Bibliotica();
        int userChoice=-1;
        while (true){
            bibliotica.printWelcome();
            bibliotica.showOptions();
            try{
            userChoice=bibliotica.getUserInput();
            }catch (Exception exception){
                exception.printStackTrace();
            }
            switch (userChoice){
                case 1:
                    bibliotica.showBooks();
                    break;
                case 2:
                    System.out.println("Enter the ISBN number");
                    bibliotica.searchBook(MainClass.getUserInput());
                     break;
                case 3:
                    System.out.println("Enter the ISBN number of the book to be reserved");
                     if(bibliotica.reserveBook(MainClass.getUserInput())){
                         System.out.println("Enter your registration number");
                      bibliotica.reserveBook(MainClass.getUserInput());
                     }

                    break;
                case 4:
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