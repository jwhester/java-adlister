
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MySQLAdsDao implements Ads {
    private Connection connection;
    public MySQLAdsDao() throws SQLException {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "Select * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(
                        new Ad(
                                rs.getLong("id"), // id
                                rs.getLong("user_id"),// user id
                                rs.getString("title"),// ad title
                                rs.getString("description")// ad description
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }
    @Override
    public Long insert(Ad newAd) throws SQLException {

        String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES (" + newAd.getUserId() + ",'" + newAd.getTitle() +"','" + newAd.getDescription() + "')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted id is: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }
    public static void main(String[] args) throws SQLException {
        Ads adsDao = new MySQLAdsDao();
        Ad testAd = new Ad(
                1,
                "test title",
                "test description"
        );
        adsDao.insert(testAd);
        List<Ad> ads = adsDao.all();
        for (Ad ad : ads) {
            System.out.println(ad);
        }
    }
}
