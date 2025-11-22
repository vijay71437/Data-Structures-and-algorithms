package Recursion;

public class R8SumOfDigits {
    public static int sumofDigit(int n){
        if(n<=0) return 0;
        return (n%10)+sumofDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumofDigit(12345));
    }
}
//Time Complexity: O(d)  d-digits
//Auxiliary space: O(d)