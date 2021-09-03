package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.ShippingPolicy;

public class ShippingPolicyFree implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
