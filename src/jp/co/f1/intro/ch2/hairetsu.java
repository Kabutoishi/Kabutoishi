package jp.co.f1.intro.ch2;

public class hairetsu {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		
		for (int number : numbers) {
			sum += number; //配列の合計
		}

		System.out.println("The sum is: " + sum);
	}

}
