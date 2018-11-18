
public class TestHeapSort {
	
	public static void sort(int[] array, int n) {
		
		for (int i = n - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapRebuild(array, 0, i);
		}
		
	}
	
	public static void heapRebuild(int[] arr, int i, int n) {
		int large = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		if (l < n && arr[1] > arr[large]) {
			large = l;
		}
		if (r < n && arr[r] > arr[large]) {
			large = r;
		}
		if (large != i) {
			int swapper = arr[i];
			arr[i] = arr[large];
			arr[large] = swapper;
			
			heapRebuild(arr, n, large);
		}
	}
	
	public static String aString (int[] arr) {	
		String holder = "";
		for (int i = 0; i < arr.length; i++) {
			holder += arr[i] + " ";
		}
		return holder;
	}
	
	
	
	public static void main(String args[]) {
		int[] aTest = {10, 9, 6, 3, 2, 5};
		int n = aTest.length;
		
		sort(aTest, n);
		System.out.println(aString(aTest));
	}
}
