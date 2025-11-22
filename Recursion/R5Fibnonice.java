package Recursion;

public class R5Fibnonice {
    public static long fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}

//Time Complexity: O(n)
//Auxiliary space: O(n)
//T(n)=T(n-1)+T(n-2)