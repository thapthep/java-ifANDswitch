
import java.util.Scanner;

public class currencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much money u wan to exchange");
        int money = sc.nextInt();
        System.err.println("what u wan to exchange to TH (JP,VN)");
        String currency = sc.next();

        // if (currency.equalsIgnoreCase("JP")) {
        // System.out.println("your money exchange JP to TH: "+ (money * 0.2));
        // } else if (currency.equalsIgnoreCase("VN")) {
        // System.out.println("your money exchange VN to TH: "+ (money * 0.0012));
        // } else {
        // System.out.println("Invalid currency");
        // }
        double resultTHbaht;
        switch (currency.toUpperCase()) {
            case "JP":
                resultTHbaht = money * 0.2;
                System.out.println("your money exchange JP to TH: " + resultTHbaht);
                break;
            case "VN":
                resultTHbaht = money * 0.0012;
                System.out.println("your money exchange VN to TH: " + resultTHbaht);
                break;
            default:
                System.out.println("Invalid currency");
        }

    }
}
