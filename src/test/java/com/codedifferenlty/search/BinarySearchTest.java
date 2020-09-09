package com.codedifferenlty.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void recursiveSearch(){
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length-1;
        int x = 10;
        int expectedIndex = 3;
        int actualIndex = ob.recursiveSearch(arr,0, n , x);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void iterativeSearch(){
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length-1;
        int x = 10;
        int expectedIndex = 3;
        int actualIndex = ob.iterativeSearch(arr, x);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

}
