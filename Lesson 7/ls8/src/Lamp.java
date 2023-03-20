public class Lamp {
    boolean status;

    public Lamp(boolean status) {
        this.status=status;
    }

    public void Status() {
        System.out.println("Lamp status: " + status);
    }

    public void newStatus(boolean newStatus) {
        this.status=newStatus;
    }
}
