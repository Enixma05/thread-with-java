import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AINodeThread extends Thread {
    private String nodeName;

    public AINodeThread(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void run() {
        AINodeDAO dao = new AINodeDAO();
        List<AINode> list = dao.getAllNodes();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        for (AINode node : list) {
            // ambil waktu saat ini
            String timestamp = LocalDateTime.now().format(formatter);

            System.out.printf("[%s] AI %s reading node: %s%n", timestamp, nodeName, node);

            try {
                Thread.sleep(500); // simulasi delay antar pembacaan
            } catch (InterruptedException e) {
                System.out.println(nodeName + " interrupted!");
            }
        }

        // log waktu selesai
        String endTime = LocalDateTime.now().format(formatter);
        System.out.printf("[%s] AI %s finished scanning database.%n", endTime, nodeName);
    }
}
