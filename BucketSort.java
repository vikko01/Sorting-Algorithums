import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    static void printArray(float arr[]){
        for(float val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void BucketSortAlgorithum(float arr[]){
        int n = arr.length;
        // Buckets
        ArrayList<Float> buckets[] = new ArrayList<>[n];
        // create empty buckets
        for(int i = 0; i < n; i++){
            buckets[i] = new ArrayList<Float>(null);
        }
        for(int i = 0; i < n; i++){
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket indivisually

        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        // merge all bucket to get final sorted array

        int index = 0;
        for(int i = 0; i < buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float arr[] = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};

        System.out.println("Original array");
        printArray(arr);

        BucketSortAlgorithum(arr);

        System.out.println("Sorted array");
        printArray(arr);
    }
}
