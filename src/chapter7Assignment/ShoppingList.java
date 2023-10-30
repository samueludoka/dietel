package chapter7Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        ArrayList<String> itemsPurchaseList = new ArrayList<>();
        ArrayList<String> quantityList = new ArrayList<>();
        ArrayList<String> pricePerUnitList = new ArrayList<>();
        String discount = String.valueOf(new ArrayList<>());


        System.out.println("Enter customer's name: ");
        String name = input1.nextLine();
        int count = 0;
        while (true) {
            System.out.println("what did the user buy");
            String itemName = input1.nextLine();
            itemsPurchaseList.add(itemName);
            input1.nextLine();

            System.out.println("how many pieces");
            String itemQuantity = input1.nextLine();
            quantityList.add(itemQuantity);

            System.out.println("how much per unit");
            String itemPrice = input1.nextLine();
            pricePerUnitList.add(itemPrice);
            count++;
            System.out.println("""
                    do you want to add more
                    press -> 1 to continue
                    press -> 2 to exit
                    """);

            String addMore = input1.next();
            if (addMore.equalsIgnoreCase("1")) {
                continue;
            }
            if (addMore.equalsIgnoreCase("2")) {


                System.out.println("how much discount will the customer get:");
                discount = input1.nextLine();

                break;
            }
            totalBillValidator(name, itemQuantity, itemPrice);

        }
        System.out.println("""
                SEMICOLON STORES MAIN BRANCH
                LOCATION: 312, HERBERT MACURLEY WAY,SABO,YABA,LAGOS
                TEL: 0980324
                DATE:
                CASHIER: NONE
                CUSTOMERS NAME: %s
                ========================================================================
                    
                ITEM                QTY                 PRICE               TOTAL(NGN)
                ------------------------------------------------------------------------
                    
                """);
        int totalGoodsPrice = 0;
        int goodsPerPrice = 0;
        for (int i = 0; i < count; i++) {
            String goods = itemsPurchaseList.get(i);
            String pricePerUnit = pricePerUnitList.get(i);
            String quantity = quantityList.get(i);
            goodsPerPrice = Integer.parseInt(quantity) * Integer.parseInt(pricePerUnit);
            totalGoodsPrice = totalGoodsPrice + i;
            System.out.printf("%s\t\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t%d", goods, quantity, pricePerUnit, goodsPerPrice);
            System.out.println();
        }

        String discountPrice = String.valueOf(totalGoodsPrice * (Double.parseDouble(discount) / 100));
        double vat = totalGoodsPrice * (17.50 / 100);
        double billTotal = totalGoodsPrice + vat - Integer.parseInt(discountPrice);
        System.out.printf("""
                --------------------------------------------------------------------------
                                            Sub Total:      %d
                                             Discount:      %s
                                          VAT @ 17.50:      %f
                ==========================================================================
                                            Bill total:     %f
                ==========================================================================
                THIS IS NOT A RECEIPT KINDLY PAY %f
                ==========================================================================

                """,totalGoodsPrice, discountPrice, vat, billTotal, vat);

    }

    private static void totalBillValidator(String name, String itemQuantity, String itemPrice) {
    double billTotal = 0;
    double subTotal = 0;
    }

}





