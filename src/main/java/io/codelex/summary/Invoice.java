package io.codelex.summary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {

    private final String invNumber;
    private InvoiceStatus status = InvoiceStatus.APPROVED;
    private BigDecimal priceVAT;
    private BigDecimal priceNoVAT;
    private final Order order;
    private final BigDecimal VAT = BigDecimal.valueOf(0.21);

    public Invoice(Order order, String invNumber) throws WrongOrderException {
        this.invNumber = invNumber;
        this.order = order;
        if (order.getItemList().isEmpty()) {
            throw new WrongOrderException("There is no order!!!");
        }
    }

    public String getInvNumber() {
        return invNumber;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public BigDecimal getPriceVAT() {
        return getPriceNoVAT().add(getVAT()).setScale(2, RoundingMode.CEILING);
    }

    public BigDecimal getPriceNoVAT() {
        return getOrder().getItemList().stream()
                .map(SellableThing::returnPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.CEILING);
    }

    public Order getOrder() {
        return order;
    }

    public BigDecimal getVAT() {
        return getPriceNoVAT().multiply(VAT).setScale(2, RoundingMode.CEILING);
    }

    public void sent() {
        status = InvoiceStatus.SENT;
    }

    public String printInvoice() {
        List<String> invoiceList = new ArrayList<>();

        invoiceList.add("===================================================");
        invoiceList.add("= INVOICE NUMBER: " + getInvNumber());
        invoiceList.add("= STATUS: " + getStatus());
        for (int i = 0; i < getOrder().getItemList().size(); i++) {
            invoiceList.add("= " + (i + 1) + ". " + getOrder().getItemList().get(i).fullInfo());
        }
        invoiceList.add("= SUM: " + getPriceNoVAT() + " EUR");
        invoiceList.add("= VAT (21%): " + getVAT() + " EUR");
        invoiceList.add("= TOTAL: " + getPriceVAT() + " EUR");
        invoiceList.add("===================================================");

        int maxLength = invoiceList.stream().mapToInt(String::length).max().orElse(0);
        String format = "%-" + maxLength + "s";
        invoiceList = invoiceList.stream()
                .map(s -> String.format(format, s))
                .map(s -> s.substring(0, s.length() - 1) + "=")
                .collect(Collectors.toList());

        return String.join("\n", invoiceList);
    }

}
