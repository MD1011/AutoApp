public class ThreadReichweiteGesammt extends Thread {

    public final int tankvolumen;
    public final double y;

    public ThreadReichweiteGesammt(int tankvolumen, double y) {
        this.tankvolumen = tankvolumen;
        this.y = y;
    }

    public void run() {

        int reichweite =((int)(tankvolumen / y) * 100);
        System.out.println("Vollgetankt kommen Sie " + reichweite + " km weit.");

}


}
