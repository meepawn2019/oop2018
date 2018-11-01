package week7.task1;

public class ExpressionTest{
	public static void main(String[] args){
		Expression a = new Numeral(10);
		Expression b = new Numeral(1);
		Expression c = new Numeral(2);
		Expression d = new Numeral(3);
		Expression mu = new Multiplication(a,a);
		Expression nhan = new Multiplication(c, d);
		Expression tru = new Subtraction(mu, b);
		Expression cong = new Addition(tru, nhan);
		Expression ngoac = new Square(cong);
		Expression ketqua = new Multiplication(ngoac, ngoac);
		System.out.println(ketqua.evaluate() + "\n" + ketqua.toString());
		Expression test = new Addition(new Subtraction(new Multiplication(new Numeral(10) ,new Numeral(10) ), new Numeral(1) ) , new Multiplication(new Numeral(2), new Numeral(3)));
		System.out.println(test.evaluate() + "\n" + test.toString());
		Expression chia = new Division(new Numeral(10), new Numeral(0));
		try{
			System.out.println(chia.evaluate());
		} catch(java.lang.ArithmeticException e){
			System.out.println("Lỗi chia cho 0");
		}
	}
}
