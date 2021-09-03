package edu.wctc.salesreporting.iface;

import edu.wctc.salesreporting.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
