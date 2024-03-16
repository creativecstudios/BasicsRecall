package Arrays;

public class PeakElement {


    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.println("Peak element: " + findPeak(arr));
    }
        public static int findPeak(int[] arr) {
            int n = arr.length;
            int a = 0;
            int b = n - 1;
    
            while (a < b) {
                int c = a + (b - a) / 2;
      
                if ((c == 0 || arr[c] >= arr[c - 1]) && (c == n - 1 || arr[c] >= arr[c + 1])) {
                    return arr[c];
                }
                
                else if (c > 0 && arr[c - 1] > arr[c]) {
                    b = c - 1;
                }
                
                else {
                    a = c + 1;
                }
            }  
            return arr[a];
        }

    }
    
    

