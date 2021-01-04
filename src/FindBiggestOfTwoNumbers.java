
public class FindBiggestOfTwoNumbers {

	public static void main(String[] args) {
		if (args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			System.out.println("a = " + a);
			System.out.println("b = " + b);

			if (a > b) {
				System.out.println(a + " is greater than " + b);
			} else {
				System.out.println(b + " is greater than " + a);
			}
		} else {
			System.out.println("No values to compare");
		}
	}

}
