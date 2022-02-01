public class ThreadReichweite extends Thread{
      private final int tankstandt;
      private final int tankstandtProzent;
      private final double y;
      private double reichweite;


    public ThreadReichweite(int tankstandt,int tankstandtProzent, double y) {
        this.tankstandt = tankstandt;
        this.tankstandtProzent = tankstandtProzent;
        this.y = y;
    }



    public void run() {
        reichweite = (((((double)tankstandt) /100)*tankstandtProzent) / y) * 100;

    }


    public double getReichweite() {
        return reichweite;
    }
}
