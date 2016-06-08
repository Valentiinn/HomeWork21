package HomeWork21;

public class SecondTask {

	public static void main(String[] args) {
		int[] array1 = { 0, 1, 2, 3, 4 };
		int[] array2 = { 1, 2, 3, 5, 6 };
		int index1 = 0, index2 = 0;
		System.out.print("Repeating element: ");
		while (index1 < array1.length & index2 < array2.length) {
			if (array1[index1] == array2[index2]) {
				index1++;
				index2++;
				System.out.print(array1[index1] + ",");

			} else {
				if (array1[index1] < array2[index2]) {
					index1++;
				} else {
					index2++;
				}
			}
		}
	}
}
