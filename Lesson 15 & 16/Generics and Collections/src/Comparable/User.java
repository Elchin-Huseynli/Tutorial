package Comparable;

public class User implements Comparable<User> {
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.age>o.age){
            return 1;
        }
        else if (this.age==o.age){
            return 0;
        }
        else {
            return -1;
        }
        //return this.name.compareTo(o.name);
    }
}
