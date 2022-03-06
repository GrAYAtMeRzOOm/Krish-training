import java.util.Scanner;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 06-Mar-22
 * Time: 1:13 AM
 * cch_missing-number
 */
public class TestCase {
    /*
     * find the missing number of the given sequence
     * */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your sequence in separate by a comma , - ");
        int[] split = sortNumberArray(scn.nextLine().split(","));
//        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            int curValue = i < split.length - 1 ? split[i + 1] : split[i];
            if ((split[0] + (i + 1)) != curValue) {
                System.out.println((split[0] + (i + 1)));
                break;
            } else {
                int point =0;
                if (split.length > 10) {
                    point = nearestPoint(Integer.parseInt(String.valueOf(split.length).split("")[1]), split);
                } else {
                    point = nearestPoint(split.length, split);
                }
                System.out.println(point);
                break;
            }
        }

    }

    private static int[] sortNumberArray(String[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (Integer.parseInt(inputArray[j]) > Integer.parseInt(inputArray[j + 1])) {
                    int tempMax = Integer.parseInt(inputArray[j]);
                    inputArray[j] = String.valueOf(Integer.parseInt(inputArray[j + 1]));
                    inputArray[j + 1] = String.valueOf(tempMax);
                }
            }
            outputArray[i] = Integer.parseInt(inputArray[i]);
        }
        return outputArray;
    }

    private static int nearestPoint(int number, int[] arr) {
        int returnValue = 0;
        if (number > 5) {
            returnValue = arr[arr.length - 1] + 1;
        } else {
            returnValue = arr[0] - 1;
        }
        return returnValue;
    }
}
