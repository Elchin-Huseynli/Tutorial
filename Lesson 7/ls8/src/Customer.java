public class Customer {
    String fullName;
    double money;


    public Customer(){}
    public Customer(String fullName,double money){
        this.fullName=fullName;
        this.money=money;
    }

    public boolean giver(int money){
        if (money <= 0) {
            return false;
        }
        else {
            this.money-=money;
            return true;
        }
    }

    public boolean sender(int money){
        if (money <= 0) {
            return false;
        }
        else {
            this.money+=money;
            return true;
        }
    }

    public String getInfo(){
        return "Fullname: " + fullName + "\nMoney: " + money;
    }

}
