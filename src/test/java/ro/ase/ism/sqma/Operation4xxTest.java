package ro.ase.ism.sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Operation4xxTest {

    @Test
    public void testBadRequest() throws Exception {
        int actual = Operation.getResponse(Codes.RESPONSE_BAD_REQUEST);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void testUnauthorized() throws Exception {
        int actual = Operation.getResponse(Codes.RESPONSE_UNAUTHORIZED);
        int expected = 401;
        assertEquals(expected, actual);
    }

    @Test
    public void testNotFound() throws Exception {
        int actual = Operation.getResponse(Codes.RESPONSE_NOT_FOUND);
        int expected = 404;
        assertEquals(expected, actual);
    }

}
