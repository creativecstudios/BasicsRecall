package Bitwise;

public class Digits {
    public static void main(String[] args) {
        // Finding the digits of numbers in log
        int n = 662314;
        int base = 10;
        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);
    }
    
}
