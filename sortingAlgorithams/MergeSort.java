package sortingAlgorithams;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 32, 5, 6 };
        int lb = 0;
        int ub = arr.length - 1;
        mergSort(arr, lb, ub);
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }

    public static void mergSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            mergSort(arr, lb, mid);
            mergSort(arr, mid + 1, ub);
            mergingArray(arr, lb, mid, ub);
        }
    }

    public static void mergingArray(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        int[] b = new int[arr.length];

        while (i <= mid && j <= ub) {

            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= ub) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = arr[i];
                i++;
                k++;
            }
        }
        for (k = lb; k <= ub; k++) {
            arr[k] = b[k];

        }
    }
}