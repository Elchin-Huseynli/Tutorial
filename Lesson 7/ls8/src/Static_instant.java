public class Static_instant {
    String name;

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Instant");
    }

    public Static_instant(String name) {
        this.name=name;
    }
}
