package backtrack.test;

import backtrack.Permute;
import org.junit.Test;

public class Junit {
    @Test
    public void permuteTest() {
        Permute permute = new Permute();
        System.out.println(permute.permute(new int[]{1, 2, 3}));
    }
}
