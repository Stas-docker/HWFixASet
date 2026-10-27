import java.util.Objects;
import java.util.UUID;

public class User {
    private final UUID id;
    private String name;
    private int age;

    public User(String name, int age, UUID id) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is empty");
        }
        this.name = name;

        if (age < 0) {
            throw new IllegalArgumentException("age cannot be less than 0");
        }
        this.age = age;

        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual;
        if (this == object) {
            isEqual = true;
        } else if (!(object instanceof User)) {
            isEqual = false;
        } else {
            User user = (User) object;
            isEqual = Objects.equals(id, user.id);
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
