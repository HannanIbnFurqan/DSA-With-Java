public class BinarySearch {

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 66, 77, 90, 100 };
        int key = 77;
        System.out.println(BinarySearch(arr, key));

    }

}