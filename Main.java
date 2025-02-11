import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean isDone = false;
        int sendToArray = 0;
        int determineSize = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (!isDone) {
            System.out.println("Please enter integer.");
            Scanner keyInput = new Scanner(System.in);
            sendToArray = keyInput.nextInt();
            nums.add(sendToArray);
            determineSize += 1;

            String answer = " ";
            System.out.println("Stop and sort numbers? (y/n)");
            while (!(answer.equals("y") || answer.equals("n"))) {
                answer = keyInput.nextLine();
                if (answer.equals("y")) {
                    isDone = true;
                } else if (answer.equals("n")) {
                    System.out.println("Alright.");
                }
            }
        }
        Object[] finishedNums = nums.toArray(new Integer[0]);
        int fNumsLength = finishedNums.length;
        Integer[] fNumsInteger = Arrays.copyOf(finishedNums, fNumsLength, Integer[].class);
        int[] fNumsInt = Arrays.stream(fNumsInteger)
                        .mapToInt(Integer::intValue)
                                .toArray();
        sortArray(fNumsInt, determineSize);
    }

    public static void sortArray(int[] myArr, int arrSize) {
        int n = 0;
        while (n < arrSize) {
            for (int i = 0; i < arrSize - 1; i++) {
                if (myArr[i] < myArr[i + 1]) {
                    int temp = myArr[i + 1];
                    myArr[i + 1] = myArr[i];
                    myArr[i] = temp;
                }
            }
            n++;
        }
        System.out.println("New array: " + Arrays.toString(myArr));
    }

}