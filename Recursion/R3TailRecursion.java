package Recursion;
//Tail recursion is a type of recursion where the recursive call is the last operation in the function.
//If a function ends with a recursive call without doing any extra work after it, then it is tail recursive.
public class R3TailRecursion {
    // without tail recursion
    public static void fun(int n){
     if(n==0) return;
     fun(n-1);
     System.out.println(n);
    }


    // same method with tail recursion
    public static void fun(int n,int k){
      if(n==0){
        return;
      }
      System.out.println(k);
      fun(n-1,k+1);
    }
    public static void main(String[] args) {
        fun(10);
        fun(10,0);
    }
}

//Time Complexity: O(n)
//Auxiliary space: O(n)
//T(n)=T(n-1)+O(1)

// Why Tail Recursion Matters?
// 1. Uses Less Stack (in languages that optimize it)

// Tail recursion replaces the current stack frame instead of creating a new one.

// 2. Helps avoid stack overflow

// When optimized, it can run for large values without crashing.

// 3. Often cleaner and easier to read

// Tail recursion can be converted directly to a loop.