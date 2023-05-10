package com.structural.adapter.sortelement;

import java.util.Arrays;

/**
 * The Service is some useful class (usually 3rd-party or legacy).
 * The client can’t use this class directly because it has an incompatible interface.
 */
public class SortArray implements ISortArray{
    @Override
    public void sortArr(int[] arr) {
        Arrays.sort(arr);
    }
}
