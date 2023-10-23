package test;
import model.Event;
public class EventTest {
    public static void main(String[] args) {
        testDefaultConstructor();
        testParameterizedConstructor();
        testGettersAndSetters();
        testEqualsMethod();
    }

    public static void testDefaultConstructor() {
        Event event = new Event();
        // Write assertions to test default constructor
    }

    public static void testParameterizedConstructor() {
        Event event = new Event(1, "sender", "opponent", Event.EventStatus.PENDING, "player", 5);
        // Write assertions to test parameterized constructor
    }

    public static void testGettersAndSetters() {
        Event event = new Event();
        // Test all getters and setters
        event.setEventId(2);
        event.setSender("newSender");
        event.setOpponent("newOpponent");
        event.setStatus(Event.EventStatus.ACCEPTED);
        event.setTurn("newPlayer");
        event.setMove(3);

        // Write assertions to check if getters and setters work as expected
    }

    public static void testEqualsMethod() {
        Event event1 = new Event(1, "sender", "opponent", Event.EventStatus.PENDING, "player", 5);
        Event event2 = new Event(1, "sender", "opponent", Event.EventStatus.PENDING, "player", 5);
        Event event3 = new Event(2, "differentSender", "opponent", Event.EventStatus.ACCEPTED, "player", 3);

        // Write assertions to test the equals method
    }
}
