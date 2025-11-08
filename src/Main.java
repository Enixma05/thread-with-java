public class Main {
    public static void main(String[] args) {
        System.out.println("=== THE PATRIOTS NETWORK ===");

        AINodeThread jd = new AINodeThread("JD");
        AINodeThread al = new AINodeThread("AL");
        AINodeThread tr = new AINodeThread("TR");
        AINodeThread tj = new AINodeThread("TJ");
        AINodeThread gw = new AINodeThread("GW");

        jd.start();
        al.start();
        tr.start();
        tj.start();
        gw.start();

        System.out.println("Central Core: All AI nodes are operational...");
    }
}
