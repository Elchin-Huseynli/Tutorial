package type;

public class User {
    @TypeManage
    private String name;
    @TypeManage
    private String surname;
    @TypeManage
    private Integer age;
    @TypeManage
    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User() {
    }

    @TypeManage
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @TypeManage
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @TypeManage
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}