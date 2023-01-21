package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> test = new ArrayList<>();
        Operation<Integer> result = arg -> {
            for (Integer integer : arg) {
                test.add(integer / divider);
            }
            return test;
        };
        return result;
    }
}
