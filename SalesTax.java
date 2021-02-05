import java.math.BigDecimal;
import java.util.Scanner;

public class SalesTax {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        // Variable Declaration
        // BidDecimal for monetary values and decimals
        BigDecimal purchasePrice;
        double stateTax;
        double countyTax;
        BigDecimal totalSalesTax;
        BigDecimal purchaseStateTax;
        BigDecimal purchaseCountyTax;

        stateTax = .04;
        countyTax = .02;


        System.out.print("What is the price for this purchase?");
        purchasePrice = keyboard.nextBigDecimal();

        System.out.println("Purchase Price: " + purchasePrice);

        System.out.println(stateTax + countyTax);
    }
}

//A program that displays the amount of the purchase, the state sales tax, the county sales tax, the total slaes tax, and the total of the sale 
// Declare Variables
// purchasePrice, stateTax, countryTax, totalSalesTax, saleTotal, purchaseStateTax, purchaseCountyTax
// Logic
// ????
// Output
// Receipt ????
