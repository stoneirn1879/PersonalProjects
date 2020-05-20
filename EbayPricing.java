import java.util.Scanner;

public class EbayPricing {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int profitMargin;
        float productPrice;
        float profitValue;
        float listingPrice;

        System.out.println("Ebay Pricing Assistant ");
        System.out.println("Enter the product price for your listing. ");
        productPrice = sc.nextFloat();

        System.out.println("Enter your profit margin. Use 1 - 150 to represent percentage");
        profitMargin = sc.nextInt();

        profitValue = (productPrice * profitMargin) / 100;
        listingPrice = productPrice + profitValue;

        System.out.println("Your product should list for: $" + listingPrice);


        sc.close();

    }


}
