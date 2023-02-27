package Model;

public class Rsale {
    private int id;
    private Date date;
    private Customer customer;
    private float amountF;
    private float dicoutn;


    public Rsale(int id, Date date, Customer customer, float amountF, float dicoutn) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.amountF = amountF;
        this.dicoutn = dicoutn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getAmountF() {
        return amountF;
    }

    public void setAmountF(float amountF) {
        this.amountF = amountF;
    }
}
