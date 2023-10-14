public class InsertionSort {

    static void InsertionSortAlgorithum(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j > 0 && arr[j] < arr[j-1]; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {8,3,6,2,4,5};
        InsertionSortAlgorithum(arr);

        for(int var : arr){
            System.out.print(var + " ");
        }
    }
}
