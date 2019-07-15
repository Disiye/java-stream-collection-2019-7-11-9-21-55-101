package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(x -> x % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(x -> x % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        arrayList = arrayList.stream().map(item -> item * 3 + 2).
                collect(Collectors.toList());
        return arrayList.stream().reduce(0, Integer::sum);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item % 2 != 0 ? item * 3 + 2 : item)
                .collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return (int) arrayList.stream()
                .filter(e -> e % 2 != 0).mapToInt(e -> e * 3 + 5)
                .summaryStatistics().getSum();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 == 0)
                .mapToInt(x -> x).summaryStatistics().getAverage();
    }

//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(e -> e % 2 == 0)
                .distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
