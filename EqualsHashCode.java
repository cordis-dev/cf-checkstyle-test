public class User1 {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

public class User2 {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;
        return user.name.equals(name) && user.age == age;
    }
}
