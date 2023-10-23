package test;
import socket.Request;
public class RequestTest {
    public static void main(String[] args) {
        testDefaultConstructor();
        testParameterizedConstructor();
        testGettersAndSetters();
    }

    public static void testDefaultConstructor() {
        Request request = new Request();
        // Write assertions to test default constructor
    }

    public static void testParameterizedConstructor() {
        Request request = new Request(Request.RequestType.LOGIN, "serializedData");
        // Write assertions to test parameterized constructor
    }

    public static void testGettersAndSetters() {
        Request request = new Request();
        // Test all getters and setters
        request.setType(Request.RequestType.REGISTER);
        request.setData("newSerializedData");

        // Write assertions to check if getters and setters work as expected
    }
}
