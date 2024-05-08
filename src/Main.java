import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();

        int[] array = {1, 3, 5, 7, 2, 4, 6};
        int[] resultArray = trainee.solution(array);
        System.out.println("Result array: " + Arrays.toString(resultArray));

        String word = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = trainee.solution(word);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}
