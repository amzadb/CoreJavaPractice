
public class WelcomeArgs {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Programming");

		if (args.length == 3) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		} else {
			System.out.println("No args");
		}
	}

}
