package e_7_1;

import java.util.Date;

public class Visit {
    Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return  this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense * (1 - DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense * (1 - DiscountRate.getProductDiscountRate(this.customer.getMemberType()));;
    }

    public double getTotalExpence() {
        return this.getProductExpense() + this.getServiceExpense();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
