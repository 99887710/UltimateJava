package codewithjeff.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDemo {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Jeff", "e1");
        Customer customer2 = new Customer("Lisa", "e2");
        customers.add(customer1);
        customers.add(customer2);

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
