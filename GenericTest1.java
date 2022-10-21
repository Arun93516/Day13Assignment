package Day13Assignment;

import java.util.Scanner;

public class GenericTest1 {
	
		public static void main(String[] args) {
			GenericTest1 generic = new GenericTest1();
			generic.Integer();

		}

		public static <T extends Comparable<T>> void solve(T num1, T num2, T num3) {
			T maxNum = num1;
			if (num2.compareTo(maxNum) > 0) {
				maxNum = num2;
			}
			if (num3.compareTo(maxNum) > 0) {
				maxNum = num3;
			}
			System.out.println("maximun Number is :" + maxNum);
		}

		public void Integer() {
			Integer num1, num2, num3;
			Scanner Number = new Scanner(System.in);
			System.out.println("Enter Num1");
			num1 = Number.nextInt();
			System.out.println("Enter Num2");
			num2 = Number.nextInt();
			System.out.println("Enter Num3");
			num3 = Number.nextInt();
			solve(num1, num2, num3);
		}

	}


