package laba34.classes;

public class WindowSill {
    private String name;
    public WindowSill(String name) {
        this.name = name;
    }

    public void attachRope(Rope rope) {
    }

    public String describe() {
        return "привязанную к " + name + " веревку, по которой Незнайка и Козлик спустились вниз";
    }
}
