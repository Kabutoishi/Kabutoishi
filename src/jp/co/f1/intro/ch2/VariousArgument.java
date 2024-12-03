package jp.co.f1.intro.ch2;

public class VariousArgument {
	
	static void checkPass(String name, int point, int passPoint) {
		
		System.out.print(name + "は、");
		if (point >= passPoint) {
			System.out.println(point + "点なので合格です。");
		}else {
			System.out.println(point + "点なので不合格です。");
		}	
		System.out.println("-----");	
		
		
	}

	public static void main(String[] args) {
		
		//点数を管理する為の変数の宣言と初期化
		
	}

}
