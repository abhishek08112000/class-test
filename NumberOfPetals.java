class NumberOfPetals {

	
	public static void isLove(int n, int flower2) {
		System.out.println("Inside isLove method");
		
		if(n > flower2) {
			n = n % 2;
			flower2 = flower2 % 3 ;
		}
	}
	
	public static void main(String[] args) {
		
		NumberOfPetals.isLove(10, 9);
		System.out.println("They are in love");
		
		NumberOfPetals.isLove(9, 10);
		System.out.println("They are not in love");
		
	}
}