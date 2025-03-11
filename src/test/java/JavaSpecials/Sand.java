package JavaSpecials;

import java.util.Arrays;

public class Sand {

	public Sand() {
		System.out.print("a");
	}

	public void Sand() {
		System.out.print("b");
	}

	public void run() {
		new Sand();
		Sand();
		test();
	}
	static void test() {
		System.out.println("c");
	}
	
	public static void main(int[] num) {
		System.out.println(Arrays.toString(num));
	}

	
	public static void main(String... args) {
		new Sand().run();
		System.out.println(Arrays.toString(args));
	}
}
