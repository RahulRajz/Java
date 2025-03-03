import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        
        System.out.print("Enter the element that you want to search: ");
        int target = sc.nextInt();

        // binary search
        int index = binarySearch(array, target);

        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } 
        else {
            System.out.println("Element not found in the array.");
        }

    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                left = mid + 1; 
            } 
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
