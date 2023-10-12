import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Basic Salary= ");
            float BS = sc.nextFloat();

            if (BS <= 500000) {
                BS = (float) BS + (BS * 0.15f) + (BS * 0.60f);
                System.out.println("Total Salary= " + BS);
            }

            if (BS > 500000 && BS < 100000) {
                BS = (float) BS - ((BS * 0.20f) + (BS * 0.15f) + (BS * 0.60f));
                System.out.println("Total Salary= " + BS);
            }

            if (BS > 10000000) {
                BS = (float) (BS - (BS * 0.30f) + (BS * 0.15f) + (BS * 0.60f));
                System.out.println("Total Salary= " + BS);
            }
        }

    }
}