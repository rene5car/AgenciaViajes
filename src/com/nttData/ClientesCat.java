package com.nttData;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.*;

class ClientesCatalog {
    public static void main(String[] args){  //manejo de precios
        final int Number_OF_ITEMS = 10;
        int[] validValues = {101,102,103,104,105,106,107,108,109,110};
        double[] prices = {1000.00,2000.00,3000.00,4000.00,5000.00,1500.00,2100.00,3700.00,4200.00,5050.00};
        String strItem;
        int itemOrdered;
        double itemPrice=0.0;
        boolean isValidItem=false;
        strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order: ");
        itemOrdered = Integer.parseInt(strItem);
        for (int x=0; x<Number_OF_ITEMS;++x){
            if (itemOrdered == validValues[x]){
                isValidItem = true;
                itemPrice = prices[x];
            }
        }
        if (isValidItem)
            JOptionPane.showMessageDialog(null, "The price of the item : " + itemOrdered + " is $" + itemPrice);
        else
            JOptionPane.showMessageDialog(null, "The item number you entered is not valid");

        //manejo de clientes
        String name;
        ClientesCatalog catCtes = new ClientesCatalog();
        int x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int Num_catCtes = 4;
        for(x=0;x<Num_catCtes;++x){
            System.out.println("Ingrese el nombre del cliente >> ");
            try {
                name = br.readLine();
                Arreglo.setCtesNames(x,name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Members of Ctes");
        for(x=0;x<Num_catCtes;++x){
            System.out.print(Arreglo.getCtes(x));
            System.out.println();
        }

        //manejo de descuentos a los clientes
        int[] discount = {0,0,0,0};
        int[] discount_values = {0,0,0,0};
        discount_values[0] = 10;
        discount_values[1] = 20;
        discount_values[2] = 30;
        discount_values[3] = 40;
        for(x=0;x<Num_catCtes;++x){
            System.out.println("Ingrese el descuento del cliente >> ");
            try {
                discount[x] = Integer.parseInt(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Descuentos de los clientes");
        for(x=0;x<Num_catCtes;++x){
            System.out.print(discount[x]+"\n"+ Arreglo.getCtes(x)+"\n");
        }
        System.out.println();
    }
}

