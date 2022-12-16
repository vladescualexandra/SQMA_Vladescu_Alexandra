package ro.ase.ism.sqma;

public class Operation {

    public static int getResponse(Codes code) throws Exception {
        return switch (code) {
            case RESPONSE_OK -> 200;
            case RESPONSE_CREATED -> 201;
            case RESPONSE_BAD_REQUEST -> 400;
            case RESPONSE_UNAUTHORIZED -> 401;
            case RESPONSE_NOT_FOUND -> 404;
            default -> throw new Exception();
        };
    }
}
