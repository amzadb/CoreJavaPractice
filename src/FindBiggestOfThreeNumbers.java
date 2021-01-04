
public class FindBiggestOfThreeNumbers {

	public static void main(String[] args) {
		if (args.length == 3) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);

			if (a > b && a > c) {
				System.out.println(a + " is greater than " + b + " and " + c);
			} else if (b > c) {
				System.out.println(b + " is greater than " + a + " and " + c);
			} else {
				System.out.println(c + " is greater than " + a + " and " + b);
			}

		} else {
			System.out.println("No values to compare");
		}
	}

}
