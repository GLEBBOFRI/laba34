package laba34.classes;

public class CashRegister {
    private String status;

    public CashRegister(String status) {
        this.status = status.toString();
    }

    public String describe() {
        return status + " с настежь раскрытыми дверцами";
    }
}
