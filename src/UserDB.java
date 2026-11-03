import java.util.UUID;

public class UserDB {
    private User maxGorbatin = new User("Max", 27);
    private User veronikaKovaleva = new User("Veronika", 20);
    private User denisIvanov = new User("Denis", 30);
    private User maxSmirnov = new User("Max", 27);

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
