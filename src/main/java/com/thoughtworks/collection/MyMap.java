package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        return array.stream().map(item -> item * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(item -> letters[item - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(item -> {
            int numFirst = item / 26;
            int numSecond = item % 26;
            String listString = "";
            if(numSecond ==0){
                numFirst -= 1;
                numSecond = 26;
            }
            if(item > 26){
                listString += letters[numFirst - 1] + letters[numSecond - 1];
            } else{
                listString += letters[numSecond - 1];
            }
            return listString;
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted()
                .collect(Collectors.toList());
    }
}
