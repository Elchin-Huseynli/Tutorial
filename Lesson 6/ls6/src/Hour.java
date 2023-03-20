public class Hour {
    int hour;
    int minute;
    int second;

    public Hour(){
    }

    public Hour(int second,int minute,int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public String fullDate(){
        String str = "Second: " + second +
                "\nMinute: " + minute +
                "\nHour: " + hour;
        return str;
    }

    public boolean newSecond(int newSecond){
        if (newSecond<=0){
            return false;
        }
        else{
            this.second=newSecond;
            return true;
        }
    }

    public boolean newMinute(int newMinute){
        if (newMinute<=0){
            return false;
        }
        else{
            this.minute=newMinute;
            return true;
        }
    }

    public boolean newHour(int newHour){
        if (newHour<=0){
            return false;
        }
        else{
            this.hour=newHour;
            return true;
        }
    }
}
