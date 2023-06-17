package sortingAlgorithams;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = new int []{6,1,8,3,2};
       
       
        System.out.println(Arrays.toString(insertionsort(arr)));
    }

    public static int[] insertionsort(int [] arr) {
          for(int i = 1; i < arr.length; i++){
             int key = arr[i];
            int j = i -1;

        while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j = j-1;
            
        }
        arr[j+1] = key;
          }

          return arr;
    }
    
}
