import java.util.Arrays;

public class ArraysSort {
    public static int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a1[] = new int[] { 2, 5, 1, 3, 6, 4, 7, 9, 0 };
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        // Arrays.sort(a1);
        // System.out.println();
        // for (int i = 0; i < a1.length; i++) {
        // System.out.print(a1[i] + " ");
        // }
        int indexValue = search(a1, 10);
        if (indexValue == -1)
            System.out.println("element not found");
        else
            System.out.println("element is found and is at index" + indexValue);

    }
}
