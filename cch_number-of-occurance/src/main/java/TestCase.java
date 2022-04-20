import java.util.Scanner;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 06-Mar-22
 * Time: 3:24 AM
 * cch_number-of-occurance
 */
public class TestCase {

    private static class Data {
        private char value;
        private int numberOfOccerrence;

        public Data() {
        }

        public Data(char value, int numberOfOccerrence) {
            this.value = value;
            this.numberOfOccerrence = numberOfOccerrence;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public int getNumberOfOccerrence() {
            return numberOfOccerrence;
        }

        public void setNumberOfOccerrence(int numberOfOccerrence) {
            this.numberOfOccerrence = numberOfOccerrence;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "value=" + value +
                    ", numberOfOccerrence=" + numberOfOccerrence +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the word to find number of occurrences - ");
        String[] stringWord = scn.nextLine().split("");
        for (Data data : findOccerrences(stringWord)) {
            System.out.println(data.toString());
        }
        /*for (String s : stringWord.split("")) {
            System.out.println(s);
        }*/
    }

    private static Data[] findOccerrences(String[] data) {
//        String[] upCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Data[] outputData = new Data[data.length];
        for (int i = 0; i < data.length; i++) {
            int occurCount = 1;
            Data tempObject = new Data();
            String tempSelected = data[i];
            tempObject.setValue(tempSelected.charAt(0));
            data = removeIndex(i, data);
            for (int k = i + 1; k < data.length - 1; k++) {
                if (tempSelected.charAt(0) == data[k].charAt(0)) {
                    tempObject.setNumberOfOccerrence(outputData[i] != null ? outputData[i].getNumberOfOccerrence() + 1 : 1);
                }
            }
            //tempObject.setNumberOfOccerrence(occurCount);
            outputData[i] = tempObject;
        }
        return outputData;
    }

    private static String[] removeIndex(int index, String[] ar) {
        String[] outputAr = new String[ar.length - 1];
        for (int i = 0; i < ar.length - 1; i++) {
            if (i != index) {
                outputAr[i] = ar[i];
            }
        }
        return outputAr;
    }

}

class TestCase2{
    public static volatile TestCase2 case2;

    private TestCase2(){

    }
}
