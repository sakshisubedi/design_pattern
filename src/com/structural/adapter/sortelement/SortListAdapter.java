package com.structural.adapter.sortelement;

import java.util.List;

/**
 * The Adapter is a class that’s able to work with both the client and the service: 
   it implements the client interface, while wrapping the service object. 
   The adapter receives calls from the client via the adapter interface and 
   translates them into calls to the wrapped service object in a format it can understand.
 */
public class SortListAdapter implements ISortList{
    private ISortArray sortArray;

    public SortListAdapter(ISortArray sortArray) {
        // we need reference to the object we are adapting
        this.sortArray = sortArray;
    }

    @Override
    public void sortL(List<Integer> list) {
        int n = list.size();

        // convert list to array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }

        sortArray.sortArr(arr);

        // convert array to list
        for (int i = 0; i < n; i++) {
            list.set(i, arr[i]);
        }
    }
}
