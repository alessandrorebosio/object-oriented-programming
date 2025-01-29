class TestComplexNum {
	public static void main(final String[] args) {

		/*
		 * 1-4) Creating c1, c2, c3, c4
		 */
		final ComplexNumber c1 = new ComplexNumber();
		c1.build(3, 5); // 3 + 5i

		final ComplexNumber c2 = new ComplexNumber();
		c2.build(7, -4); // 7 - 4i

		final ComplexNumber c3 = new ComplexNumber();
		c3.build(-2, 3); // -2 + 3i

		final ComplexNumber c4 = new ComplexNumber();
		c4.build(-2, 3); // -2 + 3i

		/*
		 * 5) Print the string representation of c1, c2, c3, c4
		 */
		System.out.println(c1.toStringRep());
		System.out.println(c2.toStringRep());
		System.out.println(c3.toStringRep());
		System.out.println(c4.toStringRep() + "\n");

		/*
		 * 6) Add c2 to c1
		 */
		c1.add(c2); // c1 = c1 + c2

		/*
		 * 7) Add c4 to c2
		 */
		c2.add(c4); // c2 = c2 + c4

		/*
		 * 8) Print the string representation of c1, c2, c3, c4 again
		 */
		System.out.println(c1.toStringRep());
		System.out.println(c2.toStringRep());
		System.out.println(c3.toStringRep());
		System.out.println(c4.toStringRep() + "\n");

		/*
		 * 10) Call the equals method on c3 three times, passing c1, c2, and c4 as
		 * input.
		 * Print the result of each call to standard output
		 */
		System.out.println(c3.equal(c1)); // check if c3 equals c1
		System.out.println(c3.equal(c2)); // check if c3 equals c2
		System.out.println(c3.equal(c4)); // check if c3 equals c4

		/*
		 * Additional test for toStringRep()
		 */
		final ComplexNumber toPrint = new ComplexNumber();
		toPrint.build(0, 0); // 0 + 0i
		System.out.println(toPrint.toStringRep());
		toPrint.build(2, 2); // 2 + 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(2, -2); // 2 - 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(-2, 2); // -2 + 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(-2, -2); // -2 - 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(0, -2); // 0 - 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(0, 2); // 0 + 2i
		System.out.println(toPrint.toStringRep());
		toPrint.build(0, -1); // 0 - 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(0, 1); // 0 + 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(2, 1); // 2 + 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(2, -1); // 2 - 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(-2, 1); // -2 + 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(-2, -1); // -2 - 1i
		System.out.println(toPrint.toStringRep());
		toPrint.build(2, 0); // 2 + 0i
		System.out.println(toPrint.toStringRep());
		toPrint.build(-2, 0); // -2 + 0i
		System.out.println(toPrint.toStringRep());
	}
}
