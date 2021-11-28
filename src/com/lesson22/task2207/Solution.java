package com.lesson22.task2207;

import java.io.*;
import java.util.*;

/*
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.addAll(Arrays.asList(fileReader.readLine().split(" ")));
        }
        fileReader.close();

        for (int i = 0; i < list.size(); i++) {
            for (int t = 0; t < list.size(); ) {
                if (i >= list.size()) {break;}
                if (list.get(t).equals(new StringBuilder(list.get(i)).reverse().toString()) && t != i) {
                    Pair pair = new Pair();
                    pair.first = list.get(t);
                    pair.first = list.get(i);
                    result.add(pair);
                    list.remove(t);
                    list.remove(i);
                    t=0;
                } else t++;
            }
        }
        result.forEach(System.out::println);
    }

    public static class Pair {
        String first;
        String second;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}

/*
c:\Users\Андрей\Desktop\файл.txt
* */