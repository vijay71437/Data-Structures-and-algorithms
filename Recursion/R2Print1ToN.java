package Recursion;

public class R2Print1ToN {
    public static void print1ton(int n){
        if(n==0){
            return ;
        }
        print1ton(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print1ton(10);
    }
}

//Time Complexity: O(n)
//Auxiliary space: O(n)
//T(n)=T(n-1)+O(1)
