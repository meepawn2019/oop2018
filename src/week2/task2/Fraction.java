package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public void setNumerator(int a){this.numerator = a;}
    public int getNumerator(){return this.numerator;}
    public void setDenominator(int a){this.denominator = a;}
    public int getDenominator(){return this.denominator;}

    public void ToiGian(){ //Toi gian bang cach chia cho UCLN
      if(this.denominator != 0 && this.numerator != 0){
        int uocChung = Task1.gcd(this.numerator, this.denominator);
        this.numerator = this.numerator/uocChung;
        this.denominator = this.denominator/uocChung;
      }
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
        //ToiGian();
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction plus = new Fraction(0, 0);
        if(this.denominator != other.denominator){ //Neu mau khac nhau thi quy dong, giong nhau thi cong tu so
          plus.denominator = this.denominator * other.denominator;
          plus.numerator = this.numerator*other.denominator + other.numerator*this.denominator;
        }
        else plus.numerator = this.numerator + other.numerator;
        plus.denominator = this.denominator;
        plus.ToiGian();
        return plus;
    }

    public Fraction subtract(Fraction other) { // Dao dau other roi cong, xong dao dau lai
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction minus = new Fraction(0, 0);
        other.numerator = 0 - other.numerator;
        minus = this.add(other);
        other.numerator = 0 - other.numerator;
        if(this.numerator != 0) minus.ToiGian();
        return minus;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multi = new Fraction(0, 0); //Nhan tu so voi tu so, mau so voi mau so
        multi.numerator = this.numerator*other.numerator;
        multi.denominator = this.denominator*other.denominator;
        multi.ToiGian();
        return multi;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divi = new Fraction(0, 0); //Nhan tu so this voi mau so other va nguoc lai
        divi.numerator = this.numerator * other.denominator;
        divi.denominator = this.denominator * other.numerator;
        divi.ToiGian();
        return divi;
    }
    public boolean equals(Object obj){ //Neu hieu 2 phan so bang 0 thi true khac 0 thi false
      if(obj == null) return false;
      Fraction a = new Fraction(0, 0);
      a = this.subtract((Fraction)obj);
      if(a.numerator == 0) return true;
      else return false;
    }

    public static void main(String args[]){
      Fraction a = new Fraction(-1, 4);
      Fraction b = new Fraction(-1, 4);
      Fraction c = new Fraction(0, 1);
      c = a.add(b);
      System.out.println(c.numerator + " " + c.denominator);
      c = a.subtract(b);
      System.out.println(c.numerator + " " + c.denominator);
      c = a.multiply(b);
      System.out.println(c.numerator + " " + c.denominator);
      c = a.divide(b);
      System.out.println(c.numerator + " " + c.denominator);
      if(a.equals(b)) System.out.println("1");
      else System.out.println("0");
    }
}
