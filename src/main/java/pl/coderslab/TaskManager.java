package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class TaskManager {
    public static void main(String[] args) {

        User user = new User();
        user.setEmail("bbb221@mail.com");
        user.setUserName("bbb");
        user.setPassword("23423423asdfastgfdggbaer6qe5gaerrge");

        UserDao uD = new UserDao();

        /*Sekcja tworzenia użytkownika*/
        System.out.println(uD.create(user));

        /*Sekcja odczytania jednego rekordu*/
        System.out.println(uD.read(4));

        /*Sekcja usuwania*/
        uD.delete(5);

        /*Sekcja odczytania wszystkich rekordów*/
        System.out.println(Arrays.toString(uD.findAll()));

        /*Sekcja modyfikacji*/
        user = uD.read(4);
        System.out.println(uD.read(4));
        user.setUserName("AlaMaKota");
        user.setEmail("alamakota@mail.com");
        user.setPassword("AbCDeAsas");
        System.out.println(user);
        uD.update(user);
        System.out.println(uD.read(4));
    }
}