package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("hello", "world", (byte) 12);
        System.out.println("User с именем - 'hello' добавлен в базу данных");
        userService.saveUser("mello", "lorld", (byte) 32);
        System.out.println("User с именем - 'mello' добавлен в базу данных");
        userService.saveUser("zello", "sorld", (byte) 22);
        System.out.println("User с именем - 'zello' добавлен в базу данных");
        userService.saveUser("tello", "gorld", (byte) 122);
        System.out.println("User с именем - 'tello' добавлен в базу данных");

        userService.removeUserById(2);

        List<User> list = userService.getAllUsers();

        for (User user : list) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
