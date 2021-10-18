/*
    Problem Link:- https://leetcode.com/problems/guess-number-higher-or-lower/


    In this problem we have to find the target element and a API is given which
    tell us whether the number we are currently on is greater than ,less than or equal to
    the target element. It returns values respective to that.

    This problem is a simple BinarySearch Based problem in the case of finding whether middle
    number is greater than or less than we will simply be using the API given by the leet code
    that's it


    Procedure:-
    1) Write Binary Search
    2) Replace the Condition of Binary Search with the API Values

    You are Done!

 */
public class HighOrLow {

static int guessNumber(int n){

    // Basic Binary Search is Applied [Step - 1]

    int start = 1;
    int end = n;


    while(start <= end){
        int mid = start + (end - start)/2;
        int value = guess(mid);

        // Values Replaced by Conditions of API Values [Step - 2]
        if (value == 1){

            start = mid + 1;

        }else if(value == -1){
            end = mid - 1;
        }else if(value == 0){
            return mid;
        }
    }

    return -1;

}

}
