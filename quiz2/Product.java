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

    public String getDetail() {
        return "Product name: " + name + ", unit price: " + price + ", description: " + description;
    }

    public String getDetail(String detail) {
        return switch (detail) {
            case "name" -> "Product name: " + name;
            case "price" -> "Product unit price: " + price;
            case "description" -> "Product description: " + description;
            default -> "Please use one of the following correct field name: name, price, description";
        };
    }

}
