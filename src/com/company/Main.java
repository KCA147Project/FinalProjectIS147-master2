package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();

//_____________________________________________________________________________________________________________________
        //ARRAY ITEM NAME CLASS
        itemName name = new itemName();
        name.displayItemMenu();
        int item_id = name.enterItemId();


//_____________________________________________________________________________________________________________________
        //ARRAY ITEM PRICE CLASS

        itemPrice thePrice = new itemPrice();
        double subtotal = thePrice.getItemPrice(item_id);
        double finalPrice;


        StateTaxes taxObject = new StateTaxes();
        String state = taxObject.getLocation();
        double taxRate = taxObject.getTax(state);


        finalPrice = (subtotal * taxRate) + subtotal;

//_____________________________________________________________________________________________________________________
        //OUTPUT

        Receipt header = new Receipt();
        header.receiptHeader();

        Receipt table = new Receipt();
        table.receiptTable();
        System.out.println("          " + fmt1.format(subtotal) + "      " + fmt2.format(taxRate) + "     " + fmt1.format(finalPrice));

        Receipt end = new Receipt();
        end.receiptEnd();

        Receipt survey = new Receipt();
        survey.receiptSurvey();


    }
}