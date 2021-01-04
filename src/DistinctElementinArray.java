public class DistinctElementinArray {
	public static void printDistinctElements(int[] arr) {
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
			}
			if (i == j) {
				System.out.println(arr[i]);
			}

		}

	}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 7, 2, 4, 7, 8, 2, 3 };
		DistinctElementinArray.printDistinctElements(nums);
	}

}