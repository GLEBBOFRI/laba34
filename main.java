package laba34;
import laba34.classes.*;
public class main {
    public static void main(String[] args) throws NoFabricResources {
        Article article = new Article();
        Stock stock = new Stock();
        RichPerson richperson = new RichPerson();
        Workers workers = new Workers();
        CashRegister cashRegister = new CashRegister("пустая несгораемая касса");
        Chests chests = new Chests("пустые несгораемые сундуки");
        Rope rope = new Rope("Веревка");
        WindowSill windowSill = new WindowSill("Подоконник");
        windowSill.attachRope(rope);
        Druaginsk druaginsk = new Druaginsk();
        MacaroniFactory macaronifactory = new MacaroniFactory();
        Spruts spruts = new Spruts("Спрутс");
        Characters neznaykaAndKozlik = new Characters("Незнайка с Козликом") {}; 
        Characters kozlik = new Characters("Козлик") {}; 
        Characters gorloderiki = new Characters("Горлодерики") {}; 
        Skuperfield skuperfield = new Skuperfield("Скуперфильд", 1000.0, 100);
        NewspaperOwners newspaperOwners = new NewspaperOwners("Владелец газеты");
        Newspaper newspaper = new Newspaper("Газета");
        System.out.println(newspaper.nachalo("Гадкинзу") + article.shupalca());
        System.out.println(article.itog() + skuperfield.ispug());
        System.out.println(gorloderiki.gorloderki() + stock.sellers() + stock.anotherday());
        System.out.println(richperson.sellstocks() + richperson.sellstockstwo() + richperson.jalost());
        System.out.println(newspaper.prodolj("Гадкинз") + article.sprutsm() + article.pravdavspruts() + article.ilinet());
        System.out.println(article.obshestvo() + article.doroje());
        System.out.println(skuperfield.radost() + skuperfield.massastocks() + skuperfield.zvonit() + stock.sutra() + skuperfield.scetbabok());
        skuperfield.calculatePurchaseSummary();
        System.out.println(skuperfield.puzir() + newspaper.newstate("Давилонские юморески") + article.statespruts() + article.povorot());
        System.out.println(article.povorot2() + article.povorot3() + article.povorot4() + stock.rjach() + stock.rjach2());
        System.out.println(skuperfield.ggwp() + skuperfield.ggwp2() + skuperfield.ggwp3() + article.moshenniki() + article.moshenniki2());
        System.out.println("На отдельных снимках можно было разглядеть:");
        System.out.println(chests.describe() + ", " + cashRegister.describe() + ", а также " + windowSill.describe() + ".");
        System.out.println( spruts.bribeNewspaperOwners() + " " + newspaperOwners.podkupil() + " " + newspaper.reportEscape("Миги и Жулио."));
        System.out.println(newspaper.alreadyReport(" об этом, ") + skuperfield.throwAwayStocks());
        System.out.println("Истратив почти весь свой запас денег на акции, " + skuperfield.getName() + ", как принято говорить, сел на мель.");
        skuperfield.buyFlour();
        try {
            System.out.println(MacaroniFactory.printFactory());
        } catch (NoFabricResources e) {
            System.err.println("Ошибка: " + e.getMessage());
            }
            skuperfield.reduceWages();
        System.out.println(workers.vozmushenie() + workers.vozmushenie2() + skuperfield.ponti() + workers.vse() + macaronifactory.stop());             
        System.out.println(skuperfield.popluspo() + workers.hard() + workers.live4die() + workers.live4die2());
        System.out.println(skuperfield.needworkers() + workers.popluspo2() + skuperfield.gotohz() + skuperfield.workersplan() + skuperfield.radostnii());
        System.out.println(neznaykaAndKozlik.describeSituation() + neznaykaAndKozlik.nowork() + neznaykaAndKozlik.noworkers() + neznaykaAndKozlik.seecar() + neznaykaAndKozlik.richhelp() + neznaykaAndKozlik.richhel1());
        System.out.println(neznaykaAndKozlik.food() + neznaykaAndKozlik.food1() + kozlik.mudrost() + kozlik.mudrost2() + neznaykaAndKozlik.lvldwn());
        System.out.println(druaginsk.beautifullife() + druaginsk.beautifullife2() + druaginsk.notbeautiful() + druaginsk.notbeautiful2());
}
}

        
    
