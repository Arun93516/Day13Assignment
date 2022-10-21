package Day13Assignment;

public class GenericTest3 {
	
		public static <T> void toPrint(T[] inputArray) {
			for (T element : inputArray) {
				System.out.print(element);
			}
			System.out.println();

		}

		private Object getMaximum;

		public void getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
			Integer maxNumber = firstNumber;
			if (secondNumber.compareTo(maxNumber) > 0) {
				maxNumber = secondNumber;
			}
			if (thirdNumber.compareTo(maxNumber) > 0) {
				maxNumber = thirdNumber;
			}
			System.out.println(maxNumber);
		}

		public void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
			Float maxNumber = firstNumber;
			if (secondNumber.compareTo(maxNumber) > 0) {
				maxNumber = secondNumber;
			}
			if (thirdNumber.compareTo(maxNumber) > 0) {
				maxNumber = thirdNumber;
			}
			System.out.println(maxNumber);
		}

		private void getMaximum(String s1, String s2, String s3) {
			if (s1.length() >= s2.length() && s1.length() >= s3.length()) {
				System.out.println(s1);

			} else if (s2.length() >= s1.length() && s2.length() >= s3.length()) {
				System.out.println(s2);

			} else {
				System.out.println(s3);

			}
		}

		public static void main(String[] args) {

			GenericTest3 generictest = new GenericTest3();
			generictest.getMaximum(3.9F,23.4F,60.9F);
			generictest.getMaximum(113452234, 231413, 234634);
			generictest.getMaximum("Arunkumar", "Prasant", "Akhildev ");

		}

}
