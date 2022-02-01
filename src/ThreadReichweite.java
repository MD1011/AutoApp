public class ThreadReichweite extends Thread{
      private final int tankstandt;
      private final int tankstandtProzent;
      private final double y;


    public ThreadReichweite(int tankstandt,int tankstandtProzent, double y) {
        this.tankstandt = tankstandt;
        this.tankstandtProzent = tankstandtProzent;
        this.y = y;
    }



    public void run() {
        double reichweite =(int) ((((tankstandt /100)*tankstandtProzent) / y) * 100);
        System.out.println("Aktuell kommen Sie " + reichweite + " km weit");
    }


}
