public class DatabaseUtil {

    private String url;
    private String username;
    private String password;

    public DatabaseUtil(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void connectedToDatabase() {
        System.out.println("Connected to database");
    }

    public void disconnectedFromDatabase() {
        System.out.println("Disconnected from database");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
