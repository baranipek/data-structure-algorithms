package search;

public class BinarySearch {

    //Complexity is O(n)
    //Linear Search
    public int searchInArray(int[] array, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }

        return -1;
    }

    //Assume the array is sorted
    //O log(n)
    public int recursiveBinarySearch(int[] array, int min, int max, int searchingElement) {
        if (min >= 0) {
            int midElement = max / 2 +1 ;

            if (array[midElement] == searchingElement) {
                return midElement;
            } else if (array[midElement] > searchingElement) {
                return recursiveBinarySearch(array, 0, midElement, searchingElement);
            }

            recursiveBinarySearch(array, midElement, max, searchingElement);
        }
        return -1;
    }
}
