package ro.ase.ism.sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Operation2xxTest {

    @Test
    public void testOk() throws Exception {
        int actual = Operation.getResponse(Codes.RESPONSE_OK);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    public void testCreated() throws Exception {
        int actual = Operation.getResponse(Codes.RESPONSE_CREATED);
        int expected = 201;
        assertEquals(expected, actual);
    }
}
