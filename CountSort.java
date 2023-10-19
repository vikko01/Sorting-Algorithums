public class CountSort {

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

    static void CountSortAlgorithum(int arr[]){
        int max = findMax(arr);
        int freq [] = new int [max + 1];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        int k = 0;
        for(int i = 0; i < freq.length; i++){
            for(int j = 0; j < freq[i]; j++){
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,1,5,3,1,3,5};
        System.out.println("Original array");
        printArray(arr);

        CountSortAlgorithum(arr);

        System.out.println("Sorted array ");
        printArray(arr);
    }
}
