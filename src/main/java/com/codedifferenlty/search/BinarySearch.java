package com.codedifferenlty.search;

import org.apache.log4j.Logger;


public class BinarySearch {

    private static final Logger logger = Logger.getLogger(BinarySearch.class);

    public int recursiveSearch(int arr[], int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - l) / 2;
            logger.info("Middle index: "+  mid);
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return recursiveSearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return recursiveSearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public int iterativeSearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            logger.info("Middle index: "+  m);
            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }


}
