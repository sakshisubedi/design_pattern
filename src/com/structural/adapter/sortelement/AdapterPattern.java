package com.structural.adapter.sortelement;

import java.util.ArrayList;
import java.util.List;

public class AdapterPattern {
    public static void main(String[] args) {
        int[] arr = new int[] {21, 5, 67, 2, 125, 41, 7};
        ISortArray sortArray = new SortArray();
        sortArray.sortArr(arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(5);
        list.add(67);
        list.add(2);
        list.add(125);
        list.add(41);
        list.add(7);

        SortListAdapter sortListAdapter = new SortListAdapter(sortArray);
        sortListAdapter.sortL(list);

        for(int i=0; i< arr.length; i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
