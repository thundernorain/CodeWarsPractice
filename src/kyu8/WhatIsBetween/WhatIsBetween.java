package kyu8.WhatIsBetween;

import java.util.ArrayList;

public class WhatIsBetween {
    public Integer[] find(int a, int b){
        var result = new ArrayList<Integer>();

        for(int i = a; i <= b; i++){
            result.add(i);
        }

        return result.toArray(new Integer[0]);
    }
}
