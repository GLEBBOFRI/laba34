package laba34.classes;

import java.util.EnumSet;

public class MacaroniFactory {

    public static String printFactory() throws NoFabricResources {
        EnumSet<FactoryNeeds> needs = EnumSet.allOf(FactoryNeeds.class);
        if (needs.isEmpty()) {
            throw new NoFabricResources("фабрика ни в чем не нуждается");
        }
        StringBuilder needsF = new StringBuilder("макаронной фабрики ");
        for (FactoryNeeds need : needs) {
            needsF.append(need.toString().toLowerCase()).append(", ");
        }
        if (needsF.length() > 0) {
            needsF.setLength(needsF.length() - 2);
        }
        return needsF.toString();
    }
    public String stop(){
        return "Фабрика остановилась, и теперь Скуперфильд уже не получал никаких доходов.";
    }
}
