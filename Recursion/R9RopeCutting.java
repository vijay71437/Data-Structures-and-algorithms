package Recursion;

public class R9RopeCutting {
    public static int maxPices(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res=Math.max(maxPices(n-a, a, b, c),Math.max(maxPices(n-b, a, b, c),maxPices(n-c, a, b, c)));
        if(res==-1) return -1;
        return res+1;
    }
    public static void main(String[] args) {
        int n=23,a=2,b=2,c=2;
        System.out.println(maxPices(n,a,b,c)); //-1

         n=23;a=11;b=12;c=9;
        System.out.println(maxPices(n,a,b,c)); //2
    }
}

//Time complexity:O(3^n)
