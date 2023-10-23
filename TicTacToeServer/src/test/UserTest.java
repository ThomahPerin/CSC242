package test;
import model.User;

public class UserTest {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        testDefaultConstructor();
        testParameterizedConstructor();
        testEqualsMethod();
    }

    /**
     *
     */
    public static void testDefaultConstructor() {
        User user = new User();
        assert user.getUsername().equals("");
        assert user.getPassword().equals("");
        assert user.getDisplayName().equals("");
        assert !user.isOnline();
    }

    /**
     *
     */
    public static void testParameterizedConstructor() {
        User user = new User("username", "password", "displayName", true);
        assert user.getUsername().equals("username");
        assert user.getPassword().equals("password");
        assert user.getDisplayName().equals("displayName");
        assert user.isOnline();
    }

    /**
     *
     */
    public static void testEqualsMethod() {
        User user1 = new User("username", "password", "displayName", true);
        User user2 = new User("username", "differentPassword", "displayName", false);
        User user3 = new User("anotherUsername", "password", "differentDisplayName", true);

        assert user1.equals(user2);
        assert !user1.equals(user3);
    }
}