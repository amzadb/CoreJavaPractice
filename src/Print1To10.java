
public class Print1To10 {

	public static void main(String[] args) {
		System.out.println("While loop");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------");

		System.out.println("Do loop");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		System.out.println("--------------");

		System.out.println("For loop");
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
	}

}
