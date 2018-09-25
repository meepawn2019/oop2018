package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while(a != b){
          if(a > b) a = a - b;
          else if(b >a) b = b - a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int fn0=0;
        int fn1=1;
        int fn=0;
        for(int i=2; i<=n; i++){
          if(n<=1) break;
          else{
            fn = fn0 + fn1;
            fn0 = fn1;
            fn1 = fn;
          }
        }
        if(n == 0) System.out.println(fn0);
        else if(n == 1) System.out.println(fn1);
        else System.out.println(fn);
        return 0;
    }

    public static void main(String args[]){
      int a, b;
      a = gcd(9,6);
      System.out.println(a);
      b = fibonacci(8);
    }
}
