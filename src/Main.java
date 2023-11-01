
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DbConnect db = new DbConnect();

        db.connect_to_db("food_delivery","admin","quan");

    }
}