package arraylist.test;

import arraylist.Intersect;
import org.junit.Test;

import java.util.Arrays;


public class Junit {

    /**
     * [4,9,5]
     * [9,4,9,8,4]
     */
    private int[] testArray1 = {4,9,5};
    private int[] testArray2 = {9,4,9,8,4};

    @Test
    public void intersectTest() {
        Intersect intersect = new Intersect();
//        int[] intersect1 = intersect.intersect(testArray1, testArray2);
        int[] intersect1 = intersect.intersect_two_pointers(testArray1, testArray2);
        System.out.println(Arrays.toString(intersect1));
    }


}
