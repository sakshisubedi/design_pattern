package com.structural.adapter.sortelement;

import java.util.Arrays;

public class SortArray implements ISortArray{
    @Override
    public void sortArr(int[] arr) {
        Arrays.sort(arr);
    }
}
