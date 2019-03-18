package e_7_1;

import java.util.Date;

public class TestCalculate {
    Customer customer;
    Visit visit;

    public TestCalculate() {
        visit = new Visit("Sam", new Date());
        visit.customer.setMemberType("Premium");

        visit.setProductExpense(100);
        visit.setServiceExpense(200);

        System.out.println(visit.getTotalExpence());
    }

    public static void main(String[] args) {
        new TestCalculate();
    }
}
