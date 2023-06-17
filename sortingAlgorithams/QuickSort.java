package sortingAlgorithams;
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = new int []{10,7,2,1,5};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr, low, high);
        printArr(arr);

    }
    public static void swap(int []arr ,int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int [] arr , int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){

                i++;
                swap(arr, i, j);

            }
        }
        swap(arr, i+1, high);
    
        return i+1;
    }
      public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void quickSort(int []arr, int low ,int high) {
        if ( low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
}
