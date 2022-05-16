package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Receipt {
    String line = new String(new char[48]).replace('\0', '_');
    String line2 = new String(new char[48]).replace('\0', '*');
//_____________________________________________________________________________________________________________________


    public void receiptHeader() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        System.out.println ("\n" + line2);
        System.out.println("              Atkinson Shields \n              Stine & Partners");
        System.out.println("\n               Store # 094254");
        System.out.println("       1000 Hilltop Cir ITE Building \n     Baltimore MD 21250" + " (410) 455-1000");
        System.out.println(dtf.format(now) +" | " + "EMPLOYEE ID: PROJECT147 ");

    }

    public void receiptTable(){

        ArrayList<String> tableHeader = new ArrayList();
                tableHeader.add("SUBTOTAL"); //0
        tableHeader.add("TAX"); //1
        tableHeader.add("TOTAL"); //2


        System.out.println ("\n" + line);
        System.out.println("          " + tableHeader.get(0) + "  |  " + tableHeader.get(1) + "  |  " + tableHeader.get(2));
        System.out.println("          "+"========" +  "    " + "====" +  "     " + "=====");

    }







}








