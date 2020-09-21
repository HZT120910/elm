package com.dongruan.util;

import java.util.Objects;

/**
 * @author shkstart
 * @create 2020-09-21 14:49
 */
public class NonullUtils {

    public static void PredicateUtil(Object... args){
        int lenth = args.length;
        for (int i = 0; i < lenth; i++) {
            Objects.requireNonNull(args[i]);
        }
    }
}
