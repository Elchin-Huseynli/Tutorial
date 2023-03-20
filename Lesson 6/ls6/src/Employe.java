public class Employe{
    String fullname;
    String position;
    String department;
    String company;
    double salary;
    String birthday;

    public Employe(String fullname, String position, String department, String company, double salary){
        this.fullname=fullname;
        this.position=position;
        this.department=department;
        this.company=company;
        this.salary=salary;
    }

    public Employe(String fullname, String position, String department, String company, double salary, String birthday){
        this.fullname=fullname;
        this.position=position;
        this.department=department;
        this.company=company;
        this.salary=salary;
        this.birthday=birthday;
    }

    public String getInfo(){
        String str = "fulname: " + fullname + "\n" +
                     "position: " + position + "\n" +
                     "department: " + department + "\n" +
                     "company: " + company +  "\n" +
                     "salary: " + salary;
        return str;
    }

    public boolean raiseSalary(double money){
        if (money<=0){
            return false;
        }
        else{
            this.salary+=money;
            return true;
        }
    }
}