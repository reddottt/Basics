package fourth_task;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingElementsFromArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int test_array[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(Arrays.toString(removeElement(test_array, scanner.nextInt())));
    }

    public static int[] removeElement(int[] arr, int elementValue) {
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == elementValue){
                count++;
            } else{
                arr[i - count] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - count);
    }
}
