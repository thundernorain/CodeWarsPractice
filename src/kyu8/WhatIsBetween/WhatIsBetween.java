package kyu8.WhatIsBetween;

import java.util.ArrayList;

public class WhatIsBetween {
    public int[] find(int a, int b){
        var result = new int[b - a + 1];

        for(int i = 0; i < result.length; i++){
            result[i] = a + i;
        }

        return result;
    }
}
