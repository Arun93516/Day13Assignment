package Day13Assignment;

public class GenericTest2 {

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
		System.out.println("maximum integer value is: " + maxNumber);
	}

	public void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println("Maximum float value is :" + maxNumber);
	}

	public static void main(String[] args) {
		GenericTest2 genericTest = new GenericTest2();
		genericTest.getMaximum(22323.5f, 325.5f, 2323.33f);
		genericTest.getMaximum(100461653, 2915634, 12323400);

	}
}
