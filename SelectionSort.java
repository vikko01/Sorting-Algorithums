public class SelectionSort {

    // Time complexity : O(n^2)
    // Space complexity : O(1)

    // Inplace Algorithum
    // not a stable algorithum

    static void SelectionSortAlgorithum(int arr[]){
        int n = arr.length;
        // for loop for passes
        for(int i = 0; i < n-1; i++){
            int min_index = i;
            // to find minimum element in the given array
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // swap the element at i index and min index
            if(min_index != i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,4,5,1,2};
        // method calling
        SelectionSortAlgorithum(arr);

        // printing the sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
