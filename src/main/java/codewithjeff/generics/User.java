package codewithjeff.generics;

public class User implements Comparable<User> {
    private int points = 0;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        //if this > other -> 1 (positive)
        //if this = other -> 0 (zero)
        //if this < other -> -1 (negative)
        return this.points - other.points;
    }

    @Override
    public String toString() {
        return "User{" +
                "points=" + points +
                '}';
    }
}
