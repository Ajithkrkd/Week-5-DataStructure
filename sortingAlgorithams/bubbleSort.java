


public class bubbleSort {
    public static void main(String[] args) {
        int [] arr  = new int[]{1,2,4,6,7,8,9,3,5};
        
        int [] sortedarray = bubblesort(arr);
        for(int i : sortedarray){
            System.out.print(i+ " ");
        }
    }
    public static int []  bubblesort(int [] arr) {
        boolean isSwapped = true;
         while(isSwapped){
             isSwapped = false;                                                                     
               for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
        
        return arr;
    }

}
