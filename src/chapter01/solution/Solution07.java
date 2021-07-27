package chapter01.solution;

import chapter01.code.Incrementable;
import chapter01.code.StaticTest;

/**
 * @author qxq
 * @date 2021/7/27
 */
public class Solution07 {
    public static void main(String[] args) {
        //Output:47
        System.out.println(StaticTest.i);
        
        //static call
        Incrementable.increment();

        //Output:48
        System.out.println(StaticTest.i);
    }
}
