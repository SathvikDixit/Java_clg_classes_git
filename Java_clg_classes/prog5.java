import java.util.*;
public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the stock price a month ago: ");
        float StockPrizeAMonthAgo = sc.nextFloat();
        System.out.print("Enter the current stock prize: ");
        float CurrentPrize = sc.nextFloat();

        float  percentage = (((CurrentPrize-StockPrizeAMonthAgo)/StockPrizeAMonthAgo)*100);

        if (percentage > 10) {
            System.out.println("Buy");
        } else if (percentage > 5 && percentage < 10) {
            System.out.println("Hold");
        } else {
            System.out.println("Sell");
        }
        sc.close();
    }
}
