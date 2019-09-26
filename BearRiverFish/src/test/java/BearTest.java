import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    River river;

    @Before

    public void setup(){
        bear = new Bear("Balloo");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test

    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
    }

    @Test

    public void shouldEvacuateBowels(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }
}
