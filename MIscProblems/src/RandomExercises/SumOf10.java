package RandomExercises;

public class SumOf10 {

	public static void main(String[] args) {
		// Write a Java program to check if the sum of all the 10's in the array is
		// exactly 30. Return false if the condition does not satisfy, otherwise true

		int[] vector = { 10, 22, 10, 15, 1, 58, 10, 7, 10 };
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == 10) {
				suma++;
			}
		}
		if (suma * 10 == 30) {
			System.out.println("True");
		} else
			System.out.println("False");
	}
}
