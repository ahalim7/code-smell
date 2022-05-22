package org.halim.code.smell.method;

import org.halim.code.smell.model.Duration;

import java.util.Date;

public abstract class InvoiceService {

    /**
     * Problem: class contains multiple methods with repeated group of parameters
     */
    public abstract Double fetchInvoiceAmountsIn(Date start, Date end);

    public abstract Double fetchReceivedInvoiceAmountsIn(Date start, Date end);

    public abstract Double fetchInvoiceOverdueAmountsIn(Date start, Date end);

    /**
     * Solution: replace the repeated group of parameters with an object
     */
    public abstract Double fetchInvoiceAmountsIn(Duration duration);

    public abstract Double fetchReceivedInvoiceAmountsIn(Duration duration);

    public abstract Double fetchInvoiceOverdueAmountsIn(Duration duration);

}
