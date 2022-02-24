import com.testing.Sum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    private Sum te;

    @BeforeEach
    public void setup() {
        te = new Sum();
    }

    @Test
    public void getSumEmpty() {
        //Arrange

        ArrayList<Integer> content = new ArrayList<>();
        int expected = 0;
        //Act and Assume
        assertEquals(expected, te.sumValues(content));
    }

    @Test
    public void getSumOneElement() {
        //Arrange

        ArrayList<Integer> content = new ArrayList<>();
        content.add(20);
        int expected = 20;
        //Act and Assume
        assertEquals(expected, te.sumValues(content));
    }

//    @Test
//    public void getSumNull() {
//        //Arrange
//
//        //  var content = null;
//        //var expected = null;
//        //Act and Assume
//        assertEquals(null, te.sumValues(null));
//    }

    @Test
    public void getSumOK() {
        //Arrange

        ArrayList<Integer> content = new ArrayList<>();
        content.add(50);
        content.add(30);
        content.add(20);
        int expected = 100;
        //Act and Assume
        assertEquals(expected, te.sumValues(content));
    }

}
