package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Receipt {
    String line = new String(new char[48]).replace('\0', '_');
    String line2 = new String(new char[48]).replace('\0', '*');
//_____________________________________________________________________________________________________________________
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public void receiptHeader() {

        System.out.println ("\n" + line2);
        System.out.println("                Atkinson Shields \n                Stine & Partners");
        System.out.println("\n                 Store # 094254");
        System.out.println("          1000 Hilltop Cir ITE Building \n        Baltimore MD 21250" + " (410) 455-1000");
        System.out.println(" " + dtf.format(now) +" | " + "EMPLOYEE ID: PROJECT147 ");

    }

    public void receiptTable(){

        ArrayList<String> tableHeader = new ArrayList();
                tableHeader.add("SUBTOTAL"); //0
        tableHeader.add("QUANTITY");//1
        tableHeader.add("TAX"); //2
        tableHeader.add("TAX PRICE"); //3
        tableHeader.add("TOTAL"); //4


        System.out.println ("\n" + line);
        System.out.println(tableHeader.get(0) + " | " + tableHeader.get(1) + " | " + tableHeader.get(2)+ " | " + tableHeader.get(3) + " | " + tableHeader.get(4));
        System.out.println("========" +  "   " + "========" +  "   " + "===" +  "   " + "========="+  "   " + "=====");

    }

    public void receiptEnd(){
        System.out.println ("\n" + line);
        System.out.println("              THANK YOU FOR SHOPPING");
        System.out.println("      FOR DETAILS ON OUR RETURN POLICY, VISIT");
        System.out.println("                 IS147.COM/RETURNS");
        System.out.println("A WRITTEN COPY OF THE RETURN POLICY IS AVAILABLE");
        System.out.println("          AT OUR CUSTOMER SERVICE DESK");
    }

    public void receiptSurvey(){
        System.out.println ("\n" + line2);
        System.out.println("*                                              *");
        System.out.println("*                                              *");
        System.out.println("*              SHARE YOUR FEEDBACK             *");
        System.out.println("*           ENTER FOR A CHANCE TO BE           *");
        System.out.println("*    ONE OF FIVE $500 WINNERS DRAWN MONTHLY!   *");
        System.out.println("*                                              *");
        System.out.println("*                                              *");

        System.out.println("*             " + dtf.format(now) +"              *");
        System.out.println (line2);

    }


}








