package com.solution;

/*
    In this problem we just have to search if particular character is present in the
    data element or not. Which can be easily solved by linear search we just have to get
    length of the data and simple check the character one by one.

    Some methods you should know before attempting this problem:-
    1)charAt
    2)length
    3)Arrays.toString(StringVariableName.toCharArray()) [This function will not be used
       but you should know about this function cause it may come handy for some other problem]


    Procedure:
    1) Simply apply Linear search and for getting char, simply use StringVariableName.charAt(index) method to
       get the character at every single index.

       Well that's all we have to do!!!

 */




public class StringSearch {

    static int linearSearch(String data,char target){

        if (data == null) {
            return -1;
        }
        // Step - 1
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
