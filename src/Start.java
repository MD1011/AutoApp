import java.util.*;


public class Start {


    public List<Auto> start(List<Auto> l1) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Mochten Sie ein neues Auto anlegen? -ja\n" +
                "Oder alle bisher angelegten Autos anschauen? -all");
        System.out.println();
        String x = scanner.next();
        if (x.equals("ja")){
            Auto neu = new Auto();
            neu.initWerte();
            l1.add(neu);
            start(l1);
        }else if (x.equals("all")){
            for (int i = 0; i < l1.size(); i++) {
                System.out.println(l1);
                return l1;
            }
            start(l1);
        }else {
            Exception Error = new Exception();
            start(l1);
            throw Error;
        }
        return l1;
    }






}
