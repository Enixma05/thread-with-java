import java.sql.*;
import java.util.*;

public class AINodeDAO {
    public List<AINode> getAllNodes() {
        List<AINode> list = new ArrayList<>();
        String sql = "SELECT * FROM ai_nodes";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new AINode(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("region"),
                        rs.getString("status")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
