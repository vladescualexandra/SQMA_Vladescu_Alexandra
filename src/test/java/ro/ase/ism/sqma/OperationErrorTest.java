package ro.ase.ism.sqma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationErrorTest {


    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void testCreated() {
        assertThrows(Exception.class, () ->
                Operation.getResponse(Codes.RESPONSE_ERROR)
        );
    }
}
