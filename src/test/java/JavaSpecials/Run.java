package JavaSpecials;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		Sand.main(args);
		int num[]= {3,5,6,7};
		Sand.main(num);

	}

}
