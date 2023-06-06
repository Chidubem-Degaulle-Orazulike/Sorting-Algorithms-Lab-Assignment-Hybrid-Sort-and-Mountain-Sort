import java.util.*;

public class HybridSort{
	public static void main(String[] args) {
                //you can try with different arrays, of course

		int[] A = {10, 5, 3, 9, 8, 7, 6};
		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

		A = hybridSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
		System.out.println();
	}

	public static int[] hybridSort(int[] A) {
		int n = A.length-1;
		boolean change = true;
		while (change && n > 0) {

			for (int i = 0; i < n; i++) {
				int temp = A[i];
				if (A[i] > A[i + 1]) {
					A[i] = A[i + 1];
					A[i + 1] = temp;
					change = false;
				}
				for (int b = 0; b < n; b++) {
					int min_idx = b;
					for (int j = b + 1; j < n; j++) {
						if (A[j] < A[min_idx]) {
							min_idx = j;
						}

						int temp2 = A[min_idx];
						A[min_idx] = A[b];
						A[b] = temp2;
					}
				}


			}

		}
			n = n-1;
		return A;
		}
	}
