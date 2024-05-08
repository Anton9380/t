import java.util.ArrayList;
import java.util.List;

public class Trainee {
    public int[] solution(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : array) {
            if (num == 3 || num == 5) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public boolean solution(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
