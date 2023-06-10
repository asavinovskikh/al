package src.main.java.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//жадный алгоритм
public class Greedy {
    public static void main (String[] args) {
        List <Integer> achievment = new ArrayList<>(Arrays.asList(2, 3, 5, 1, 3));
        int hours = 5;

        System.out.println(getMaxGreed(achievment, hours));
    }

    private static int getMaxGreed (List<Integer> achievment, int hours) {
        Collections.reverse(achievment);
        int sumResult = 0;
        for(int i : achievment) {
            if (hours > 0) {
                sumResult +=i;
            } else {
                return sumResult;
            }
        }
        return sumResult;
    }


}


