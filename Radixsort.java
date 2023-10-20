public class Radixsort {

    static int findMax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void printArray(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void CountSortSecondMethodAlgorithum(int arr[], int place){
        int n = arr.length;
        int output [] = new int [n];

        
        int freq[] = new int[10];
        for(int i = 0; i < arr.length; i++){
            freq[(arr[i]/place)%10]++;
        }

        // Making an prefix sum array

        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i-1];
        }

        // find the index of each element in original array and put it in output array
        for(int i = n-1; i >=0; i--){
            int index = freq[(arr[i]/place)%10] - 1;

            output[index] = arr[i];

            freq[(arr[i]/place)%10]--;
        }
        // copy all the elements of output to original array
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void RadixsortAlgorithum(int arr[]){
        int max = findMax(arr);
        for(int place = 1; max/place > 0; place *= 10){
            CountSortSecondMethodAlgorithum(arr,place);
        }
    }
    public static void main(String[] args) {
        int arr[] = {170,45,75,90,802,2};

        System.out.println("Original array");
        printArray(arr);

        RadixsortAlgorithum(arr);

        System.out.println("Sorted array");
        printArray(arr);
    }
}
