package sliding_window.test;

import org.junit.Test;
import sliding_window.MinWindow;

public class Junit {
    @Test
    public void MinWindowTest() {
        MinWindow minWindow = new MinWindow();

        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = minWindow.minWindow(s, t);
        System.out.println(s1);
    }

}
