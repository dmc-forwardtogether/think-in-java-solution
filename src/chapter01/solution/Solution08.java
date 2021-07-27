package chapter01.solution;

/**
 * @author qxq
 * @date 2021/7/27
 */
public class Solution08 {
    static int i = 47;

    public static void main(String[] args) {
        Solution08 st1 = new Solution08();
        Solution08 st2 = new Solution08();
        
        //47 equals 47
        System.out.println(st1.i + " equals " +st2.i);
        
        //This usage is not recommended , use i++ instead
        st1.i++;
        //48 still equals 48
        System.out.println(st1.i + " still equals " +st2.i);
        
        st2.i++;
        //49 still equals 49
        System.out.println(st1.i + " still equals " +st2.i);
    }
}
