import java.util.*;

public class shell_sort
{
	public static void main(String[] args) {
		 int[] array = { 22, 53, 33, 12, 75, 65, 887, 125, 37, 977 };
		 System.out.println("Before Sorting : ");
		 System.out.println(Arrays.toString(array));
		 System.out.println("===================");
		 System.out.println("After Sorting : ");
		 array = shellsort(array);
		 System.out.println(Arrays.toString(array));
		 }
		 
		 private static int[] shellsort(int[] array) {
		 
		 // first part uses the Knuth's interval sequence
		 int h = 1;
		 while (h <= array.length / 3) {
		 h = 3 * h + 1; // h is equal to highest sequence of h<=length/3
		 // (1,4,13,40...)
		 }
		 
		 // next part
		 while (h > 0) { // for array of length 10, h=4
		 
		 // This step is similar to insertion sort below
		 for (int i = 0; i < array.length; i++) {
		 
		 int temp = array[i];
		 int j;
		 
		 for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
		 array[j] = array[j - h];
		 }
		 array[j] = temp;
		 }
		 h = (h - 1) / 3;
		 }
		 return array;
		 }

}
