package com.perScholas.groupHandsOnActivity2.lambdaExpressionsWithGeneric;

@FunctionalInterface
public interface GroupOneFunctionalInterface <T, R>{
    R transform(T input);
}

