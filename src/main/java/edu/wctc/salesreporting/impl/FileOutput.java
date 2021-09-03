package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.iface.SalesOutput;

public class FileOutput implements SalesOutput {
    @Override
    public void salesOutput(String text) {
        System.out.println(text);
    }
}
