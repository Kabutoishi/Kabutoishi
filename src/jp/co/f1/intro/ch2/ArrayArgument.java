package jp.co.f1.intro.ch2;

public class ArrayArgument {

	static void display(String[] aryData) {
		for (int i = 0; i < aryData.length; i++) {
			System.out.println(aryData[i]);
		}
	}
	
	public static void main(String[] args) {
		
		String[] hotSpring = {"別府", "湯布院" ,"伊東"};
		
		System.out.println("---三大温泉---");
		
	display(hotSpring);

	}

}
