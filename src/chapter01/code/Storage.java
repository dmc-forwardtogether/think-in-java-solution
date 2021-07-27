package chapter01.code;

/**
 * @author qxq
 * @date 2021/7/27
 */
public class Storage {
    public int storage(String s) {
        return s.length() * 2;
    }

    public void print(String s) {
        System.out.println("storage(s) = " + storage(s));
    }
}
