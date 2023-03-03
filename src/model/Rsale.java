package model;

public class Rsale {
    private String id;
    private Date date;
    private Customer customer;
    private String amountF;
    private String dicoutn;


    public Rsale(String id, Date date, Customer customer, String amountF, String dicoutn) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.amountF = amountF;
        this.dicoutn = dicoutn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAmountF() {
        return amountF;
    }

    public void setAmountF(String amountF) {
        this.amountF = amountF;
    }
}
