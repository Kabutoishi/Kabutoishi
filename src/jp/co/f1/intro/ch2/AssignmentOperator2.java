package jp.co.f1.intro.ch2;

public class AssignmentOperator2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//加算用の値を管理する変数
		int plus = 10;
		plus += 5;
		System.out.print("plus += の結果、 plus の値は、");
		System.out.println(plus);
		
		//減算用の値を管理する変数
		int minus = 10;
		minus -=5;
		System.out.print("minus -= 5 の結果、 minus の値は、");
		System.out.println(minus);
		
		//乗算用の値を管理する変数
		int multiply = 10;
		multiply *= 5;
		System.out.print("multiply *= 5 の結果、変数 multiply の値は、");
		System.out.println(multiply);
		
		//除算用の値を管理する変数
		int divide = 10;
		divide /= 5;
		System.out.print("divide /-5 の結果、変数divideの値は、");
		System.out.println(divide);
		
		
	}

}
