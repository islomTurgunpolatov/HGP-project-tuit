package registration.uz.hgpuserregistration.Order;

import lombok.Data;

@Data
public class OrderStatistic {
    private String year;
    private String month;
    private int number;
    private double income;

    @Override
    public String toString() {
        return "OrderStatistic{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", number=" + number +
                ", income=" + income +
                '}';
    }
}
