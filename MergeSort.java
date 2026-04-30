public class MergeSort {
    static void main(String[] args) {
        int[] arr ={38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, low:0, high:arr.length - 1);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}
