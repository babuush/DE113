public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.description = "";
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void getDetail() {
        System.out.println("Product name: " + name + ", unit price: " + price + ", description: " + description);
    }

    public void getDetail(String detail) {
        switch (detail) {
            case "name" -> System.out.println("Product name: " + name);
            case "price" -> System.out.println("Product unit price: " + price);
            case "description" -> System.out.println("Product description: " + description);
            default ->
                    System.out.println("Please use one of the following correct field name: name, price, description");
        }
        ;
    }

}
