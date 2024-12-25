package laba34.classes;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Integer> prices;

    public Stock() {
        prices = new ArrayList<>();
        prices.add(70);
        prices.add(80);
    }

    public String gorloderki() {
        return "Горлодерики принялись скупать акции на всех трех баржах в огромных количествах.";
    }

    public String sellers() {
        return "Продавцы акций быстро убедились, что товар их охотно покупается, и начали поднимать цену.";
    }

    public String anotherday() {
        return "На другой день гигантские акции продавались уже по " + prices.get(0) + " сантиков, а еще через день -- по " + prices.get(1) + ".";
    }

    public String sutra() {
        return "чтоб они с утра отправлялись на баржу и начинали продажу акций по фертингу штука.";
    }

    public String rjach() {
        return "Нетрудно представить себе, что творилось на барже, когда скуперфильдовские горлодерики начали ";
    }

    public String rjach2() {
        return "предлагать гигантские акции по целому фертингу штука. Ничего, кроме смеха, их предложения не могли вызвать. ";
    }
}
