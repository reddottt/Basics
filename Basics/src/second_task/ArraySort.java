package second_task;

import java.util.Arrays;
import static first_task.MinMaxAverage.*;
import first_task.MinMaxAverage;

public class ArraySort{
    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        MinMaxAverage.generateArrayValues();
        as.sort();
        System.out.println(Arrays.toString(array));
    }

    public void sort(){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
