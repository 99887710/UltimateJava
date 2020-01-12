package codewithjeff.generics;

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User(3);
        User user2 = new User(2);

        if (user1.compareTo(user2) > 0)
            System.out.println("user1 is greater than user2");

        System.out.println(Utils.max(1, 2));
        System.out.println(Utils.max(user1, user2));

        Utils.printKeyPair("num", 2);
        Utils.printKeyPair("name", "kelly");

    }
}
