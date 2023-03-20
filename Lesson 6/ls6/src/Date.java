public class Date {
    int day;
    int month;
    int year;

    public Date(){
    }

    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String fullDate(){
        String str = "Day: " + day +
                     "\nMonth: " + month +
                     "\nYear: " + year;
        return str;
    }

    public boolean newDay(int newDay){
        if (newDay<=0){
            return false;
        }
        else{
            this.day=newDay;
            return true;
        }
    }

    public boolean newMonth(int newMonth){
        if (newMonth<=0){
            return false;
        }
        else{
            this.month=newMonth;
            return true;
        }
    }

    public boolean newYear(int newYear){
        if (newYear<=0){
            return false;
        }
        else{
            this.year=newYear;
            return true;
        }
    }


}
