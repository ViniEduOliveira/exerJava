package entities;

public class Product implements Comparable<Product>{

    private Integer index;
    private String name;
    private String type;
    private double price;

    public Product(Integer index, String name, String type, double price) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product outher) {
        return Double.compare(outher.getPrice(), this.getPrice());
    }
}
