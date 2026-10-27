import java.util.UUID;

public class UserDB {
    private User maxGorbatin = new User("Max", 27, UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"));
    private User veronikaKovaleva = new User("Veronika", 20, UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8"));
    private User denisIvanov = new User("Denis", 30, UUID.fromString("a3bb189e-8bf9-3888-9912-ace4e6543002"));
    private User maxSmirnov = new User("Max", 27, UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"));

    public User getMaxGorbatin() {
        return maxGorbatin;
    }

    public User getVeronikaKovaleva() {
        return veronikaKovaleva;
    }

    public User getDenisIvanov() {
        return denisIvanov;
    }

    public User getMaxSmirnov() {
        return maxSmirnov;
    }
}
