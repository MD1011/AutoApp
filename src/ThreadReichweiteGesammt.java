public class ThreadReichweiteGesammt extends Thread {

    public final int tankvolumen;
    public final double y;
    private int reichweiteVoll;

    public ThreadReichweiteGesammt(int tankvolumen, double y) {
        this.tankvolumen = tankvolumen;
        this.y = y;
    }

    public void run() {

        reichweiteVoll =((int)(tankvolumen / y) * 100);


}


    public int getReichweite() {
        return reichweiteVoll;
    }
}
