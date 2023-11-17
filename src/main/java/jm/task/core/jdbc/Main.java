package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("hello", "world", (byte) 12);
        userService.saveUser("mello", "lorld", (byte) 32);
        userService.saveUser("zello", "sorld", (byte) 22);
        userService.saveUser("tello", "gorld", (byte) 122);

        userService.removeUserById(2);

        List<User> list = userService.getAllUsers();

        for (User user : list) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
