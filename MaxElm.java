import java.util.Scanner;

class MaxElm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Bubble sort 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int largest = arr[n-1];
        int smallest = arr[0];
        System.out.println("Largest Element: "+largest);
        System.out.println("smallest Element: "+smallest);
    }
}
