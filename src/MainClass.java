import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainClass {
    public static void main(String[] args) {
        PersonRegister personRegister = new PersonRegister();
        personRegister.addPerson("Rahul", "111-1111","Rahul");
        personRegister.addPerson("Rodger", "111-1112","Rodger");
        Biblioteca biblioteca = new Biblioteca();
        int userChoice = -1;
        while (true) {
            System.out.println(biblioteca.printWelcome());
            biblioteca.showOptions();
            userChoice = Integer.parseInt(getUserInput());

            switch (userChoice) {
                case 0:
                    biblioteca.showBooks();
                    break;
                case 1:
                    System.out.println("Enter the ISBN number");
                    biblioteca.searchBook(Integer.parseInt(MainClass.getUserInput()));
                    break;
                case 2:
                    reserveTheBook(personRegister, biblioteca);
                     break;
                case 3:
                    checkRegistrationNumberOfUser(personRegister);
                    break;
                case 4:
                    biblioteca.listMovies();
                   break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter the Valid choice");
            }
        }
    }

    public static void checkRegistrationNumberOfUser(PersonRegister personRegister) {
        System.out.println("Enter your registration number");
        String userRegNo = MainClass.getUserInput();
        System.out.println("Enter your password");
        String passwd = MainClass.getUserInput();

        if (personRegister.isAValidMember(userRegNo,passwd)) {
            System.out.println("Welcome " + personRegister.getPersonObject(userRegNo));
        }
    }

    public static void reserveTheBook(PersonRegister personRegister, Biblioteca biblioteca) {
        System.out.println("Enter the ISBN number of the book to be reserved");
        int bookNo = Integer.parseInt(MainClass.getUserInput());
        if (biblioteca.isBookInRack(bookNo)) {
            System.out.println("Enter your registration number");
            String userRegNo = MainClass.getUserInput();
            Book useRequestedBook = biblioteca.reserveBook(bookNo, userRegNo);
            Person currPerson = personRegister.getPersonObject(userRegNo);
            if (currPerson != null && useRequestedBook != null) {
                personRegister.addBooksForAPerson(userRegNo, useRequestedBook);
                System.out.println("Thank You.Enjoy the book!");
            } else
                System.out.println("Sorry book copy not available or Registration Expired");
        }
        else
            System.out.println("Sorry book not available in Library");
    }

    public static String getUserInput() {
        String userInput=null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            userInput = bufferedReader.readLine();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return userInput;
    }
}