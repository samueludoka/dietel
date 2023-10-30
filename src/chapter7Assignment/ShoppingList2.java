package chapter7Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList2 {
    Scanner input = new Scanner(System.in);
    private final ArrayList<String> itemsPurchaseList = new ArrayList<>();
    private final ArrayList<String> quantityList = new ArrayList<>();
    private final ArrayList<String> pricePerUnitList = new ArrayList<>();
    private final ArrayList<Double> subTotal = new ArrayList<>();
    private double discount;
    double totalGoodsPrice = 0;
    String customersName;

    private void displayInput() {
        System.out.println("Hello Welcome To Semicolon Store\nWhat Your Name? ");
        customersName = input.nextLine();
    }

    private void itemCollection() {
        boolean checker = true;
        while (checker) {
            collector();
            System.out.println("""
                    do you want to add more
                    press -> 1 to continue
                    press -> 2 to exit
                    """);
            String addMore = input.next();
            if (addMore.equalsIgnoreCase("1")) {
                continue;
            }
            if (addMore.equalsIgnoreCase("2")) {
                System.out.println("how much discount will the customer get:");
                discount = input.nextDouble();
                checker = false;
            }
        }
    }

    private double calculation(Double number1, double number2) {
        return number1 * number2;
    }

    private void firstInvoice() {
        System.out.printf("""
                SEMICOLON STORES MAIN BRANCH
                LOCATION: 312, HERBERT MACURLEY WAY,SABO,YABA,LAGOS
                TEL: 0980324
                DATE:
                CASHIER: Sam
                CUSTOMERS NAME: %s
                ========================================================================
                    
                ITEM                QTY                 PRICE               TOTAL(NGN)
                ------------------------------------------------------------------------
                    
                """, customersName);
        for (int i = 0; i < subTotal.size(); i++) {
            String goods = itemsPurchaseList.get(i);
            String pricePerUnit = pricePerUnitList.get(i);
            String quantity = quantityList.get(i);
            Double subTotalOfGoodsPrice = subTotal.get(i);
            totalGoodsPrice = totalGoodsPrice + subTotalOfGoodsPrice;
            System.out.printf("%s\t\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t%f", goods, quantity, pricePerUnit, subTotalOfGoodsPrice);
            System.out.println();
        }
        System.out.println();
    }

    private void secondInvoice() {
        double vat = totalGoodsPrice * (17.50 / 100);
        double billTotal = (totalGoodsPrice + vat) - discount;
        System.out.printf("""
                --------------------------------------------------------------------------
                                            Sub Total:      %f
                                             Discount:      %f
                                          VAT @ 17.50:      %f
                ==========================================================================
                                            Bill total:     %f
                ==========================================================================
                THIS IS NOT A RECEIPT KINDLY PAY %f
                ==========================================================================

                """, totalGoodsPrice, discount, vat, billTotal, billTotal);
    }

    private void collector() {
        System.out.println("what did the user buy");
        String itemName = input.next();
        itemsPurchaseList.add(itemName);

        System.out.println("how many pieces");
        String itemQuantity = input.next();
        quantityList.add(itemQuantity);

        System.out.println("how much per unit");
        String itemPrice = input.next();
        pricePerUnitList.add(itemPrice);
        subTotal.add(calculation(Double.parseDouble(itemQuantity), Double.parseDouble(itemPrice)));
    }

    private void collectPayment() {

        System.out.printf("""
                SEMICOLON STORES MAIN BRANCH
                LOCATION: 312, HERBERT MARCURLEY WAY,SABO,YABA,LAGOS
                TEL: 0980324
                DATE:
                CASHIER: Sam
                CUSTOMERS NAME: %s
                ========================================================================
                    
                ITEM                QTY                 PRICE               TOTAL(NGN)
                ------------------------------------------------------------------------
                    
                """, customersName);
        Double subTotalOfGoodsPrice = null;
        for (int i = 0; i < subTotal.size(); i++) {
            String goods = itemsPurchaseList.get(i);
            String pricePerUnit = pricePerUnitList.get(i);
            String quantity = quantityList.get(i);
            subTotalOfGoodsPrice = subTotal.get(i);
            totalGoodsPrice = totalGoodsPrice + subTotalOfGoodsPrice;
            System.out.printf("%s\t\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t%f", goods, quantity, pricePerUnit, subTotalOfGoodsPrice);
            System.out.println();
        }
    }
    private void collectPayment2() {
        System.out.println("how much did the costumer pay: ");
        double pay = input.nextDouble();
        double billTotal = 0;
        double balance = pay - billTotal/2;
        double vat = totalGoodsPrice * (17.50 / 100);
        billTotal = (totalGoodsPrice + vat) - discount;
        System.out.printf("""
                --------------------------------------------------------------------------
                                            Sub Total:      %f
                                             Discount:      %f
                                          VAT @ 17.50:      %f
                ==========================================================================
                                            Bill total:     %f
                                            Amount paid:    %f
                                            Balance:        %f
                ==========================================================================
                THANK YOU FOR YOUR PATRONAGE
                ==========================================================================

                """, totalGoodsPrice, discount, vat, billTotal / 2, pay, balance);


    }


    public void shop() {
        displayInput();
        itemCollection();
        firstInvoice();
        secondInvoice();
        collectPayment();
        collectPayment2();
    }
}


