package com.solution;

/*
    In this problem we have to find the maximum number in the list. We can
    simply find that by assuming first element to be the greatest number and
    then changing the greatest number after we find another greatest number in the list.

    Note:- Array is unsorted. If it was sorted we would have applied BinarySearch
    cause it has a very good time complexity compare to the Linear Search.

    Procedure:-
    1) Use Linear search and create temporary variable for storing the max value.

        Well that's all you have to do in this problem.

 */

public class MaxValue {


static int maxValue(int[] data){

    if (data.length == 0) {
        return -1;
    }

    int max = data[0]; // Temp Variable 

    for (int i = 1; i < data.length; i++) { // Step - 1
        if (data[i] > max) {
            max = data[i];
        }
    }
    return max;
}

}
