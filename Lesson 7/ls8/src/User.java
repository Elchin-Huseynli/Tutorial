public class User {
    String fullName;
    String mail;
    int age;

    public User(String fullName,String mail,int age){
        this.fullName=fullName;
        this.mail=mail;
        this.age=age;
    }

    public String getInfo(){
        return "Fullname: " + fullName +
                "\nMail: " + mail +
                "\nAge: " + age;
    }
}
