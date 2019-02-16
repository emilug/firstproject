package RandomExercises;
import java.util.Arrays;

public class ArithOfElemWthMinMax {

	public static void main(String[] args) {
		// Print the arithmetic mean (media aritmetica) of the elements of an array,
		// without the min and the max

		int[] vector = { 15, 64, 25, 188, 17 };
		Arrays.sort(vector);
		int suma = 0;
		for (int i = 1; i < vector.length - 1; i++) {
			suma = suma + vector[i];
		}
		System.out.println((float) suma / (vector.length - 2));
	}

}
