package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) { // Gan so lon hon bang hieu 2 so cho den khi bang nhau
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a=Math.abs(a);
        b=Math.abs(b);
        while(a != b){
          if(a > b) a = a - b;
          else if(b >a) b = b - a;
        }
        return a;
    }

    public static int fibonacci(int n) { // F(n) = F(n-1) + F(n-2)
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
        switch (n) {
            case 0:
                return fn0;
            case 1:
                return fn1;
            default:
                return fn;
        }
    }

    public static void main(String args[]){
      int a, b;
      a = gcd(9,6);
      System.out.println(a);
      System.out.println(fibonacci(8));
    }
}
