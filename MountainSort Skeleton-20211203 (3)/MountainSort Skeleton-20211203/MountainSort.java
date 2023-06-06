import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;
import java.util.Collections;

public class MountainSort {

	public static void main(String[] args) {
		int[] A= {34, 12, 7, 43, 55, 41,97,28,2,62};

		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

		A = MountainSort(A);

		System.out.println();
		System.out.println("Array sorted: " + Arrays.toString(A));
	}

	public static int[] MountainSort(int[] A) {


		if (A.length == 0){
			return new int[0];
		}else{
			int max = Arrays.stream(A).max().getAsInt();
			int min = Arrays.stream(A).min().getAsInt();

			int range = max - min + 1;
			int count[] = new int[range];
			int sorted[] = new int[A.length];


			for(int i = 0; i < A.length; i++){
				count[A[i] - min]++;
			}

			for (int j = 1; j < count.length; j++){
				count[j] += count[j - 1];
			}
			for (int i = A.length - 1; i >= 0; i--) {
				sorted[count[A[i] - min] - 1] = A[i];
				count[A[i] - min]--;
			}
			int k = A.length-1;

			for (int i = 0; i < A.length; i++) {
				if (i > (A.length/2)-1){
					A[i] = sorted[k];
					k--;
				}else{
					A[i] = sorted[i];
				}

			}

			return A;

		}
			}

	//you can add your own functions if you want

}
