import java.util.List;

public class User {
    private String name;
    private int workEx;
    private List<String> tasks;

    public User(String name, int workEx, List<String> tasks) {
        this.name = name;
        this.workEx = workEx;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public int getWorkEx() {
        return workEx;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", workEx=" + workEx +
                ", tasks=" + tasks +
                '}';
    }
}
