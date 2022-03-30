// COP3330 Group Project
// Team Members: James Gonzalez, Ben 
// Program will function as an inventory manager for a resturant.


import java.util.ArrayList;
import java.util.Scanner;


public class Main_Project {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList InvTransList = new ArrayList();

    Inventory MainInv = new Inventory();


        System.out.println("You currently have " + MainInv.getCheese() + " amount of cheese");
        System.out.println("You currently have " + MainInv.getLettuce() + " amount of lettuce");
        System.out.println("You currently have " + MainInv.getBread() + " amount of bread");
        System.out.println("You currently have " + MainInv.getBacon() + " amount of bacon");
        System.out.println("You currently have " + MainInv.getTomatoes() + " amount of tomatoes");

        System.out.println();

        System.out.println("Now Making BLT\n");
        MainInv.setBacon(1);
        MainInv.setBread(1);
        MainInv.setCheese(1);
        MainInv.setLettuce(1);
        MainInv.setTomatoes(1);


        System.out.println("All Done Enjoy!");

        System.out.println("You currently have " + MainInv.getCheese() + " amount of cheese");
        System.out.println("You currently have " + MainInv.getLettuce() + " amount of lettuce");
        System.out.println("You currently have " + MainInv.getBread() + " amount of bread");
        System.out.println("You currently have " + MainInv.getBacon() + " amount of bacon");
        System.out.println("You currently have " + MainInv.getTomatoes() + " amount of tomatoes");



    }
}




class Inventory {

    private int Cheese;
    private int Lettuce;
    private int Bread;
    private int Tomatoes;
    private int Bacon;

    Inventory() {

    this.Cheese = 100;
    this.Lettuce = 100;
    this.Bread = 200;
    this.Tomatoes = 100;
    this.Bacon = 100;

    }

    public int getCheese() {
        return Cheese;
    }

    public int getLettuce() {
        return Lettuce;
    }

    public int getBread() {
        return Bread;
    }
    
    public int getTomatoes() {
        return Tomatoes;
    }

    public int getBacon() {
        return Bacon;
    }

    public void setCheese(int x) {
        Cheese -= x;
    }

    public void setLettuce(int x) {
        Lettuce -= x;
    }

    public void setBread(int x) {
        Bread -= x;
    }
    
    public void setTomatoes(int x) {
        Tomatoes -= x;
    }

    public void setBacon(int x) {
        Bacon -= x;
    }

}

class BLT {

    private int BLTcount = 0;
    Inventory BLTing = new Inventory();


    BLT(int Cheese, int Lettuce, int Bread, int Bacon, int Tomatoes) {            // Makes the BLT and removes ingredients from the inventory

        BLTing.setBacon(1);
        BLTing.setBread(1);
        BLTing.setBread(1);
        BLTing.setLettuce(1);
        BLTing.setTomatoes(1);
        BLTcount++;

    }

    public int GetBLTcount() {
        return BLTcount;
    }




}