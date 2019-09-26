import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before(){
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNuberToList(){
        myNumbers.addNumber(12);
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        myNumbers.addNumber(12);
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        myNumbers.addNumber(1);
        myNumbers.addNumber(2);
        myNumbers.addNumber(3);
        myNumbers.addNumber(4);
        assertEquals(20, myNumbers.getTotal());
    }
}
