import java.io.BufferedReader;
import java.io.IOException;
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
                    try{
                    bibliotica.searchBook(MainClass.getISBN());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }

    }
    public static int getISBN() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
        }

    }

}
