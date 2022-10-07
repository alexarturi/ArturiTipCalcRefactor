import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of people in the party: ");
        int people = scan.nextInt();
        System.out.println("Tip percentage(do not use percent symbol): ");
        double tip = scan.nextDouble();
        System.out.println("Input bill cost: ");
        double billBeforeTip = scan.nextDouble();

        TipCalculator bill = new TipCalculator(people, tip, billBeforeTip);

        //producing output to user. Also, rounding all numbers to 2 decimal places
        System.out.println("The total bill is $" + String.format("%.2f", bill.totalBill()));
        System.out.println("The total tip is $" + String.format("%.2f", bill.tipAmount()));
        System.out.println("The tip per person is $" + String.format("%.2f", bill.perPersonTipAmount()));
        System.out.println("The total per person is $" + String.format("%.2f", bill.perPersonTotalCost()));

    }
}
