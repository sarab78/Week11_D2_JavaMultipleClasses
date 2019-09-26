import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordCollectionTest {

    private WordCollection myWords;

    @Before
    public void before(){
        myWords = new WordCollection();
    }

    @Test
    public void canGetWordCount(){
        assertEquals(5, myWords.getWordCount());
    }
}
