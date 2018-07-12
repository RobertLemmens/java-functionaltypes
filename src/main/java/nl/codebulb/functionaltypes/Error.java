package nl.codebulb.functionaltypes;

public class Error {
    public static java.lang.Error undefined() {
        return error("undefined");
    }
    public static java.lang.Error error(final String s) {
        throw new java.lang.Error(s);
    }
}
