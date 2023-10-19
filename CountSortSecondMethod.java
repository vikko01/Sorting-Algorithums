public class CountSortSecondMethod {

    static void printArray(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findMax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void CountSortSecondMethodAlgorithum(int arr[]){
        int n = arr.length;
        int output [] = new int [n];

        int max = findMax(arr);
        int freq[] = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        // Making an prefix sum array

        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i-1];
        }

        // find the index of each element in original array and put it in output array
        for(int i = n-1; i >=0; i--){
            int index = freq[arr[i]] - 1;

            output[index] = arr[i];

            freq[arr[i]]--;
        }
        // copy all the elements of output to original array
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,1,5,3,1,3,5};

        System.out.println("Original Array ");
        printArray(arr);

        CountSortSecondMethodAlgorithum(arr);

        System.out.println("Sorted Array ");
        printArray(arr);

    }
}
