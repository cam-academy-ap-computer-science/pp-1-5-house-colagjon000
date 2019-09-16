
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisThe();
		System.out.println("house that Jack built.\n");
		verse1();
		verse2_1();
		verse2_2();
		verse3_1();
		verse3_2();
		verse4_1();
		verse4_2();
		verse5_1();
		verse5_2();
		verse6_1();
		verse6_2();
	}
	public static void thisThe() {
		System.out.print("This is the ");
	}
	public static void thatLay() {
		System.out.println("That lay in the house that Jack built.\n");
	}
	public static void verse1() {
		thisThe();
		System.out.println("malt");
		thatLay();
	}
	public static void verse2_1() {
		thisThe();
		System.out.println("rat,");
	}
	public static void verse2_2() {
		System.out.println("That ate the malt");
		thatLay();
	}
	public static void verse3_1() {
		thisThe();
		System.out.println("cat,");
	}
	public static void verse3_2() {
		System.out.println("That killed the rat,");
		verse2_2();
	}
	public static void verse4_1() {
		thisThe();
		System.out.println("dog,");
	}
	public static void verse4_2() {
		System.out.println("That worried the cat,");
		verse3_2();
	}
	public static void verse5_1() {
		thisThe();
		System.out.println("cow with the crupmpled horn,");
	}
	public static void verse5_2() {
		System.out.println("That tossed the dog,");
		verse4_2();
	}
	public static void verse6_1() {
		thisThe();
		System.out.println("maiden all forlon,");
	}
	public static void verse6_2() {
		System.out.println("That milked that cow with the crumpled horn,");
		verse5_2();
	}
}
