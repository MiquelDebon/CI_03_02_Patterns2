package S3_02_N2_Callback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShoeShop {
    private String name;
    private List<Sale> salesList;

    public ShoeShop (String name){
        this.name = name;
        this.salesList = new ArrayList<>();
    }


    public List<Sale> getSalesList() {
        return salesList;
    }
    public void addSale(Sale sale) {
        this.salesList.add(sale);
    }
    public double calculateTotal(){
        return salesList.stream()
                .mapToDouble(p -> p.getAsynchronousAmount())
                .sum();
    }

}
