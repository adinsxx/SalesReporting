package edu.wctc.salesreporting;

import edu.wctc.salesreporting.iface.SalesInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReporting {
    private SalesInput input;
    @Autowired
    public SalesReporting(SalesInput input) {
        this.input = input;
        System.out.println("Program start");
    }



    public void generate() {
        List<Sale> sale = input.getSales();
    }
}
