public class Car implements Vehicle {

    private DatabaseUtil database;

    public Car(DatabaseUtil database) {
        this.database = database;
    }

    @Override
    public void save() {
        System.out.println(
                "Car DB info \n " +
                        database.getUrl() + "\n" +
                        database.getUsername() + "\n" +
                        database.getPassword() + "\n" +
                        "____________________________");
    }
}
