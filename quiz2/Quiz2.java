public class Quiz2 {
    public static void main(String[] args) {
        Product p1 = new Product("Shirt", 99, "Short sleeve");
        Product p2 = new Product("Shirt", 50.0);
        System.out.println(p1.getDetail());
        System.out.println(p2.getDetail("name"));
        System.out.println(p2.getDetail("price"));
        System.out.println(p2.getDetail("description"));
        System.out.println(p2.getDetail("test"));

    }
}
