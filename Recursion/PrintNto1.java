package Recursion;

public class PrintNto1{
    public static void printnto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnto1(n-1);
    }
    public static void main(String args[]){
      printnto1(10);
    }
}

//Time Complexity: O(n)
//Auxiliary space space: O(n)
//T(n)=1+T(n-1)