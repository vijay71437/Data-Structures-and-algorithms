package Recursion;

public class R6SumOfNaturalNo {
    public static long getSum(int n){
      if(n==0) return 0;
      return n +getSum(n -1);
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println(getSum(n));
    }
}
//Time Complexity: O(n)
//Auxiliary space: O(n)
//T(n)=T(n-1)+O(1)