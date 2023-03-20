package inheritance;

public class Notebook extends Computer {
    boolean tauchpad;
    boolean adapter;

    public Notebook(String name, int ram, int hdd, boolean tauchpad, boolean adapter) {
        super(name, ram, hdd);
        this.tauchpad = tauchpad;
        this.adapter = adapter;
    }

    public boolean isTauchpad() {
        return tauchpad;
    }

    public void setTauchpad(boolean tauchpad) {
        this.tauchpad = tauchpad;
    }

    public boolean isAdapter() {
        return adapter;
    }

    public void setAdapter(boolean adapter) {
        this.adapter = adapter;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nRam: " + ram +
                "\nHdd: " + hdd +
                "\nTaucpad : " + tauchpad +
                "\nAdapter: " + adapter;
    }
}
