class TestCalculator {
	public static void main(final String[] args) {
		/*
		 * Uncomment the code below once Calculator has been created!
		 */

		final Calculator calc = new Calculator();
		System.out.println("1 + 2 =" + calc.add(1, 2));
		System.out.println("-1 - 2 =" + calc.sub(-1, 2));
		System.out.println("6 * 3 =" + calc.mul(6, 3));
		System.out.println("8 / 4 =" + calc.div(8, 4));
	}
}
