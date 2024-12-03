package jp.co.f1.intro.ch2;

public class Variable {

	public static void main(String[] args) {

		//名前を管理する変数
		String name ;
		name = "兜石 拓実";
				
		//慎重を管理する変数
		double height;
		height = 177.6;
		
		//年齢を管理する変数
		int age;
		age = 29;
		
		//血液型を管理する変数
		char blood;
		blood = 'O';
		
		System.out.print(name);
		System.out.print("さんの身長は");
		System.out.print(height);
		System.out.println("cmです。");
		
		System.out.print("年齢は");
		System.out.print(age);
		System.out.println("歳です。");
		
		System.out.print("血液型は");
		System.out.print(blood);
		System.out.print("型です。");
		
	}

}
