package HandlingTables;

public class Stringmethods {

	public static void main(String[] args) {
		String s = "6.7 Mbps";
		String v = s.substring(0, s.indexOf(' '));
		System.out.println(v);
	}

}
