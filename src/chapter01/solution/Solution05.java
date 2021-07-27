package chapter01.solution;

import chapter01.code.DateOnly;

/**
 * @author qxq
 * @date 2021/7/27
 */
public class Solution05 {
    public static void main(String[] args) {
        DateOnly dateOnly = new DateOnly();
        
        //assignment
        dateOnly.i = 1;
        dateOnly.d = 3.1415926;
        dateOnly.b = true;

        //Output:i = 1
        //d = 3.1415926
        //b = true
        System.out.println("i = " + dateOnly.i);
        System.out.println("d = " + dateOnly.d);
        System.out.println("b = " + dateOnly.b);
    }

}
