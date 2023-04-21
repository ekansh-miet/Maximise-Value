import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long[] a=new long[(int)n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long c=0;
        for(int i=1;i<n;i++){
            c=Math.max(c,a[i-1]*a[i]);
        }
        System.out.println(c);
    }
}