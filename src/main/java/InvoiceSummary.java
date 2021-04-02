import java.util.Objects;

public class InvoiceSummary {

    private final int numberofrides;
    private final double totalfare;
    private final double averageFare;

    public InvoiceSummary(int numberofrides, double totalFare) {
    this.numberofrides = numberofrides;
    this.totalfare = totalFare;
    this.averageFare = this.totalfare/this.numberofrides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberofrides == that.numberofrides && Double.compare(that.totalfare, totalfare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }


}

