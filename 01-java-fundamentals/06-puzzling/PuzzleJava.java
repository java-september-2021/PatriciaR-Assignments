import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{
    Random rand = new Random();
     public void getTenRolls(){
         ArrayList<Integer> arr = new ArrayList<Integer>();
         for (int i = 0; i < 10; i++){
            arr.add(rand.nextInt(20));
         }
         System.out.println(arr);
     
}
    public char getRandomLetter(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
    for (char ch = 'a'; ch <= 'z'; ++ch) {
      alphabet.add(ch);
    }
    int index = rand.nextInt(25);
    char letter = alphabet.get(index);
    return letter;
    }

    public String generatePassword(){
        String password= "";
        for (int i = 0; i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    public void getNewPasswordSet(int num){
        ArrayList<String> password = new ArrayList<String>();
        for (int i = 0; i < num; i ++){
            password.add(generatePassword());
        }
        System.out.println(password);
    }
}