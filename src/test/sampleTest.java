import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sampleTest {

    @Test
    void add() {
        sample sample = new sample();
        int result = sample.add(2, 3);
        assertEquals(5,result);
    }
}