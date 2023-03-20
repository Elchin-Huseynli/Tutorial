package ls5;

import java.util.Arrays;

public class arr_binarysearch {
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(arr, key);
        
	    System.out.println("The given vowel is at index: " + foundItemIndex);

    }
}
