package io.codelex.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {

        Item food = new FoodItem("Milk", BigDecimal.valueOf(0.75), LocalDate.of(2022, 11, 5));
        Item electronic = new ElectronicsItem("Radio", BigDecimal.valueOf(25.00), 100);
        Item houseHold = new HouseholdItem("Bucket", BigDecimal.valueOf(5.00), "red");
        ItemPacking packing = new ItemPacking();

        Order order = new Order();
        order.addItem(packing);
        order.addItem(food);
        order.addItem(electronic);
        order.addItem(houseHold);

        System.out.println(order.printList());
        Invoice invoice = new Invoice(order, "ABC123");
        System.out.println(invoice.printInvoice());
        invoice.sent();
        System.out.println(invoice.printInvoice());


    }
}
