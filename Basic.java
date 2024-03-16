package Arrays;


import java.util.Arrays;
public class Basic {

    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] nums2 = {1, 2, 1};

        int[] concatenatedArray = concatenateNumber(nums1, nums2);
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
    }

    public static int[] concatenateNumber(int[] num1, int[] num2) {
        int number1 = num1.length;
        int number2 = num2.length;
        
        int[] answer = new int[number1 + number2];
        
        for (int i = 0; i < number1; i++) {
            answer[i] = num1[i];
        }
        
        for (int i = 0; i < number2; i++) {
            answer[number1 + i] = num2[i];
        }
        
        return answer;
    }

    
}

   
    
       
    
        
    
    

