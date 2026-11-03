import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final UUID id;
    private String name;
    private int age;

    public User(String name, int age) {
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID();
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

    private void validateName(String name) {
        final Pattern pattern = Pattern.compile("[a-zA-Z]+");
        final Matcher matcher = pattern.matcher(name);
        if (name == null || name.isBlank() || !matcher.matches()) {
            throw new IllegalArgumentException("Name is not appropriate");
        }
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be less than 0");
        }
    }
}
