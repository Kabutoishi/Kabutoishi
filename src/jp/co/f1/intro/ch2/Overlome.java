package jp.co.f1.intro.ch2;

public class Overlome {

	public static void main(String[] args) {
		 System.out.println(add(5, 10)); // 2つの整数を加算
	        System.out.println(add(5.5, 10.5)); // 2つの小数を加算
	        System.out.println(add("Hello, ", "World!")); // 2つの文字列を連結
	    }

	    // 2つの整数を加算するメソッド
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    // 2つの小数を加算するメソッド
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // 2つの文字列を連結するメソッド
	    public static String add(String a, String b) {
	        return a + b;

	}

}
