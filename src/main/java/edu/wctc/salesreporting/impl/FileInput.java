package edu.wctc.salesreporting.impl;

import edu.wctc.salesreporting.Sale;
import edu.wctc.salesreporting.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("sales.txt"));
            while (scanner.hasNext()){
                String[] line = scanner.nextLine().split(",");
                Sale sale = new Sale(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                sales.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sales;
    }
}
