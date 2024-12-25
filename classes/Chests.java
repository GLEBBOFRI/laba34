package laba34.classes;

public class Chests {
    private String status;

    public Chests(String status) {
        this.status = status.toString();
    }
    public String describe() {
        return status.toString();
    }
}
