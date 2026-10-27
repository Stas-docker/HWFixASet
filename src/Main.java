import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        UserDB userDB = new UserDB();
        users.add(userDB.getMaxGorbatin());
        users.add(userDB.getDenisIvanov());
        users.add(userDB.getMaxSmirnov());
        users.add(userDB.getVeronikaKovaleva());

        if (users.size() == 3) {
            System.out.println("System works well!");
        } else {
            throw new RuntimeException("Users set size should be 3!");
        }
    }
}
