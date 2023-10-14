import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int arr[]){
       
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                     flag = true;
                }
                 if(flag == false){
                return;
            }
           
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements of the array to be sorted");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);

        System.out.println("Sorted array");

       for(int i : arr){
        System.out.print(i + " ");
       }
        sc.close();
    }
}
