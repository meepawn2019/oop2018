package week7.task1;

public class Division extends BinaryExpression{
	private Expression left;
	private Expression right;

	public Division(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}

	public Expression left(){return this.left;}
	public Expression right(){return this.right;}

	public int evaluate(){
		return this.left.evaluate() / this.right.evaluate();
	}

	public String toString(){
		return this.left.toString() + " / " + this.right.toString();
	}
}