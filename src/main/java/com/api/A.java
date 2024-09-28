package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public  class A{
    public static void main(String[] args) {
        List<Integer> nub= Arrays.asList(1,2,5,1,10,15);
        Optional<Integer> max = nub.stream().min(Integer::compare);
        System.out.println(max.get());


    }
}