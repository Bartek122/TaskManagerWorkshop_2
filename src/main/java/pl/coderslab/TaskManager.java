package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class TaskManager {
    public static void main(String[] args) {

//        User user = new User();
//        user.setEmail("bbb221@mail.com");
//        user.setUserName("bbb");
//        user.setPassword("23423423asdfastgfdggbaer6qe5gaerrge");

        UserDao uD = new UserDao();
//        System.out.println(uD.create(user));
        //System.out.println(uD.read(5));
        //uD.delete(5);
        System.out.println(Arrays.toString(uD.findAll()));
    }
}