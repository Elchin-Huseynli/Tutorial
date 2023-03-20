package inheritance;

public class Computer {
    String name;
    int ram;
    int hdd;

    public Computer(String name, int ram, int hdd) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
