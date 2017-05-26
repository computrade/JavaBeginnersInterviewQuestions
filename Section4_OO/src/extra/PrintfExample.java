package extra;

public class PrintfExample {
    public static void main(String[] args) {
        double cost = 1.0; // $1.00
        String product = "Gizmo";
        System.out.printf("Price of %s:  $%.2f", product, cost);
    }
}

