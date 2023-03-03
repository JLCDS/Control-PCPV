package model;

public class Product  {
    private float price; // precio actual
    private Supplier supliter;
    private int idProduct;

    private Category category;

    public Product(float price, Supplier supliter, int idProduct, Category category) {
        this.price = price;
        this.supliter = supliter;
        this.idProduct = idProduct;
        this.category = category;
    }

    public float  getPrice() {
        return price;
    }

    public void setPrice(float  price) {
        this.price = price;
    }

    public Supplier getSupliter() {
        return supliter;
    }

    public void setSupliter(Supplier supliter) {
        this.supliter = supliter;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
