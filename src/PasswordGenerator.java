import java.util.Random;

public class PasswordGenerator {
    private Random generator = new Random();
    private UserInput input = new UserInput();
    private int[] randomIntTab;
    private char generatedPassword[];

    public void generatePassword() {
        input.initializePasswordLengthFromUser();
        setRandomIntTabLength();
        for (int i = 0; i < input.getPasswordLength(); i++) {
            generatedPassword[i] = (char) randomIntTab[i];
        }
    }

    //Generate numbers between 33 and 126.
    private void generateRandomIntTab(){
        for(int i=0; i<input.getPasswordLength(); i++){
            randomIntTab[i] = generator.nextInt(93)+33;
        }
    }

    private void setRandomIntTabLength(){
        randomIntTab = new int[input.getPasswordLength()];
        setGeneratedPasswordLength();
        generateRandomIntTab();
    }

    private void setGeneratedPasswordLength(){
        generatedPassword = new char[input.getPasswordLength()];
    }

    public char[] getGeneratedPassword(){
        return generatedPassword;
    }
}
