public class Quiz2 {
    public static void main(String[] args) {
        Product p1 = new Product("Shirt", 99, "Short sleeve");
        Product p2 = new Product("Shirt", 50.0);
        p1.getDetail();
        p2.getDetail("name");
        p2.getDetail("price");
        p2.getDetail("description");
        p2.getDetail("test");

    }
}
