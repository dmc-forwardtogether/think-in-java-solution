package chapter01.solution;

import chapter01.code.Storage;

/**
 * @author qxq
 * @date 2021/7/27
 */
public class Solution06 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        Storage storage = new Storage();
        
        //Output: storage(s) = 26
        storage.print(s);
    }
}
