import java.security.InvalidParameterException;
import java.util.Scanner;

public class UserInput {
    private int passwordLength;
    private Scanner scanner = new Scanner(System.in);

    public void initializePasswordLengthFromUser() throws InvalidParameterException {
        System.out.println("Enter the length of the password: ");
        passwordLength = scanner.nextInt();
        checkIfException();
    }

    private void checkIfException(){
        if((passwordLength<8)||(passwordLength>32)){
            throw new InvalidParameterException("Password length must be between 8 and 32 characters.");
        }
    }

    public int getPasswordLength(){
        return passwordLength;
    }
}
