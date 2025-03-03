import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element that you want to search: ");
        int target = sc.nextInt();

        // linear search
        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } 
        else {
            System.out.println("Element not found in the array.");
        }

    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }
}
