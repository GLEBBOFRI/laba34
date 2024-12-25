package laba34.classes;

import java.util.ArrayList;
import java.util.Arrays;

public record Newspaper(String name) {
    private static final ArrayList<String> states = new ArrayList<>(Arrays.asList(
        " чтоб они не печатали до поры до времени сообщений о бегстве ",
        "Но теперь, когда газеты сообщили ",
        "На следующий день в газете, также принадлежавшей господину ",
        "Дело в том, что господин ",
        "Наутро, еще до открытия давилонской баржи, в газете "
    ));

    public String reportEscape(String name) {
        return states.get(0) + name;
    }

    public String alreadyReport(String news) {
        return states.get(1) + news;
    }

    public String nachalo(String name){
        return states.get(2) + name + ", появилась статья, которая называлась \"Куда тянутся щупальца Спрутса?\". ";
    }

    public String prodolj(String name){
        return states.get(3) + name + " продолжал свое дело и в тот же день напечатал статью, которая называлась \"Почему Спрутс помалкивает?\". ";
    }

    public String newstate(String name){
        return states.get(4) + name + "\" появилась статья в которой объяснялись причины молчания Спрутса. ";
    }
}
