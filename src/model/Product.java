package model;

public class Product  {
    private String price; // precio actual
    private Supplier supliter;
    private String idProduct;

    private Category category;

    public Product(String price, Supplier supliter, String idProduct, Category category) {
        this.price = price;
        this.supliter = supliter;
        this.idProduct = idProduct;
        this.category = category;
    }

    public String  getPrice() {
        return price;
    }

    public void setPrice(String  price) {
        this.price = price;
    }

    public Supplier getSupliter() {
        return supliter;
    }

    public void setSupliter(Supplier supliter) {
        this.supliter = supliter;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
