package Arrays;

import java.util.Arrays;
public class ReverseNum {

    public static void main(String[] args) {
        int[] OriginalArray = {1, 2, 3};

        System.out.println("Original array: " + Arrays.toString(OriginalArray));
        int[] reversedArray = Arrays.copyOf(OriginalArray, OriginalArray.length);

        reverseArray(reversedArray);

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
    

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    
}

    

