package DesingPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        DBconnection db1 = DBconnection.getInstance();
        DBconnection db2 = DBconnection.getInstance();

        System.out.println("Debug");

    }
}
