class UtilityBill {
    private String consumerName;
    private int unitsConsumed;

    public UtilityBill(String consumerName, int unitsConsumed) {
        if (unitsConsumed < 0) throw new IllegalArgumentException("Units cannot be negative.");
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void classifySlab() {
        String slab;
        double rate;

        // Slabs follow the manual's required ranges.
        if (unitsConsumed > 700) {
            slab = "Slab-4"; rate = 25.0;
        } else if (unitsConsumed >= 301) {
            slab = "Slab-3"; rate = 20.0;
        } else if (unitsConsumed >= 201) {
            slab = "Slab-2"; rate = 15.0;
        } else if (unitsConsumed >= 100) {
            slab = "Slab-1"; rate = 10.0;
        } else {
            slab = "Lifeline"; rate = 5.0;
        }

        double bill = unitsConsumed * rate;
        System.out.printf("%-12s | Units: %3d | %-9s | Rate: Rs. %.2f/unit | Bill: Rs. %.2f%n",
                consumerName, unitsConsumed, slab, rate, bill);
    }
}

public class UtilityBillCategory {
    public static void main(String[] args) {
        UtilityBill[] bills = {
            new UtilityBill("Ayesha", 80),
            new UtilityBill("Bilal", 150),
            new UtilityBill("Hina", 250),
            new UtilityBill("Usman", 500),
            new UtilityBill("Sara", 800)
        };

        System.out.println("Consumer     | Units | Slab      | Approximate bill");
        System.out.println("---------------------------------------------------------------");
        for (UtilityBill bill : bills) bill.classifySlab();
    }
}
