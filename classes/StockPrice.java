package laba34.classes;

public enum StockPrice {
    SIXTY("шестьдесят"),
    SEVENTY("семьдесят"),
    EIGHTY("восемдесят");

    private final String value;

    StockPrice(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value) + " сантиков";
    }
}
