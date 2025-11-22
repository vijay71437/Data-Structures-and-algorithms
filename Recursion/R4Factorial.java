package Recursion;

public class R4Factorial {
    public static long fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}



//Time Complexity: O(n)
//Auxiliary space: O(n)
//T(n)=T(n-1)+O(1)