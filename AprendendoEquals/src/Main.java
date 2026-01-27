public class Main {
    public static void main(String[] args) {

       Product p1 = new Product(1L, "Mouse", 100.0);
       Product p2 = new Product(1L, "Mouse Gamer", 250.0);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
