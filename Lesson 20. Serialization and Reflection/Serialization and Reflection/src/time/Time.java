package time;


public class Time {
    @TimeManage(value = "Hour: ")
    private String hour;

    @TimeManage
    private String minute;

    @TimeManage(value = "Second: ")
    private String second;

    @TimeManage(value = "Nanosecond: ")
    private String nanoSecond;

    public Time(String hour, String minute, String second, String nanoSecond) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.nanoSecond = nanoSecond;
    }

    public Time() {
    }
    @TimeManage(value = "Hour: ")
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    @TimeManage
    public String getMinute() {
        return minute;
    }
    public void setMinute(String minute) {
        this.minute = minute;
    }
    @TimeManage(value = "Second: ")
    public String getSecond() {
        return second;
    }
    public void setSecond(String second) {
        this.second = second;
    }
    @TimeManage(value = "Nanosecond: ")
    public String getNanoSecond() {
        return nanoSecond;
    }
    public void setNanoSecond(String nanoSecond) {
        this.nanoSecond = nanoSecond;
    }

}
