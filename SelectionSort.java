import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an Array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Selection sort 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Display sorted array
        System.out.println("Before Sorting: ");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("After Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
