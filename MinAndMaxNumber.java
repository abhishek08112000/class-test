class MinAndMaxNumber {

	public static void main(String[] args) {

		int arr[] = { 45, 333, 76, 29, 900, 23, 474, 654, 29, 454 };

		int max = arr[0];
		int min = arr[1];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("The maximum number is " + max);
		System.out.println("The minimum number is " + min);

	}
}