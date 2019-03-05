/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author v1
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inventory myInventory = new Inventory();
        myInventory.addCapacitor("1c", 8);
        myInventory.addTransistor("7t", 77);
        myInventory.addResistor("13k", 9);
        myInventory.addCapacitor("2c", 18);
        myInventory.addCapacitor("2ac", 18);
        myInventory.addInductor("12in", 33);
        myInventory.addCapacitor("11c", 28);
        //myInventory.printInventory();
        myInventory.addResistor("1k", 3);
        myInventory.addResistor("2k", 13);
        myInventory.addResistor("1k", 32);
        myInventory.addTransistor("1t", 8);
        myInventory.addCapacitor("11c", 2);
        //myInventory.printInventory();
        myInventory.addInductor("12ind", 5);
        myInventory.addResistor("8k", 133);
        myInventory.addInductor("13ind", 15);
        myInventory.deleteInductor("12ind", 1);
        myInventory.addInductor("15ind", 55);
        myInventory.deleteCapacitor("2c", 4);
        //myInventory.printInventory();
        myInventory.addTransistor("1t", 3);
        myInventory.addTransistor("2t", 9);
        //myInventory.printInventory();
        myInventory.deleteTransistor("1t", 1);
        myInventory.deleteTransistor("2t", 3);
        myInventory.deleteResistor("8k", 4);
        myInventory.printInventory();
        
        
    }
    
}
