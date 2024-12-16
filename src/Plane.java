public class Plane implements Vehicle {

    private DatabaseUtil database;

    public void setDatabase(DatabaseUtil database) {
        this.database = database;
    }

    @Override
    public void save() {
        System.out.println(
                "Plane DB info \n " +
                        database.getUrl() + "\n" +
                        database.getUsername() + "\n" +
                        database.getPassword() + "\n" +
                        "____________________________");
    }
}
