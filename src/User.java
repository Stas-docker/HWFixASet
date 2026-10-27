import java.util.Objects;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual;
        if (this == object) {
            isEqual = true;
        } else if (object == null || object.getClass() != getClass()) {
            isEqual = false;
        } else {
            User user = (User) object;
            isEqual = age == user.age && Objects.equals(name, user.name);
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
