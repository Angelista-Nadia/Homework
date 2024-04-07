import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 23, List.of("run", "sleep")));
        users.add(new User("Leo", 12, List.of("sleep")));
        users.add(new User("Ivan", 8, List.of("jump")));
        users.add(new User("Liza", 32, List.of("run", "jump", "work")));

        //Пользователи с задачами больше 2
        List<User> users2Tasks = new ArrayList<>();
        for (User user : users){
            if (user.getTasks() != null && user.getTasks().size() >2){
                users2Tasks.add(user);
            }
        }

        //Уникальные имена пользователей
        Set<String> uniqueUsernames = new HashSet<>();
        for (User user : users){
            uniqueUsernames.add(user.getName());
        }

        //Пользователи со стажем работы от большего к меньшему
        Set<User> usersWorkEx = new TreeSet<>(Comparator.comparingInt(User::getWorkEx).reversed());
        usersWorkEx.addAll(users);


        System.out.println(users2Tasks);
        System.out.println(uniqueUsernames);
        System.out.println(usersWorkEx);
    }
}
