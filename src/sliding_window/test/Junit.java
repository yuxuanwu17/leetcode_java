package sliding_window.test;

import org.junit.Test;
import sliding_window.CheckInclusion;
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
    @Test
    public void CheckInclusionTest() {
        CheckInclusion checInclusion = new CheckInclusion();

        String s = "hello";
        String t = "ooolleoooleh";
        Boolean s1 = checInclusion.checkInclusion(s, t);
        System.out.println(s1);
    }

}
