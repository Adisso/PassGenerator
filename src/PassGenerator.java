import java.util.Random;
import java.util.Scanner;

public class PassGenerator {

    public static void main(String[] args) {

        int passwordLength = 0;

        do {
            //Enter the length of your password.
            System.out.println("Podaj dlugosc hasla: ");
            Scanner odczyt1 = new Scanner(System.in);
            passwordLength = odczyt1.nextInt();

            //Password length must be beetween 8 and 32 characters.
        }while((passwordLength<8)||(passwordLength>32));

        //Create a Tab with length of our password.
        int randomTab[] = new int[passwordLength];
        Random generator = new Random();

        for(int i=0; i<passwordLength; i++){
            //Generate number between 33 and 126.
            randomTab[i] = generator.nextInt(93)+33;
        }
        //Create a new char tab.
        char password[] = new char[passwordLength];

        for(int i=0; i<passwordLength; i++){
            //Convert Tab with numbers into char to get ASCI symbols.
            password[i] = (char)randomTab[i];
            //Print the password.
            System.out.print(password[i]);
        }

    }
}
