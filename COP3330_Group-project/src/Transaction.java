import java.util.ArrayList;

class Transcation {

ArrayList<String> Trans = new ArrayList<String>();


Transcation() {

}

   public void AddTrans(String x) {

    Trans.add(x);

   }


   public void PrintTrans(){

   int counter = 1;

   System.out.println("\nDisplayed Below Are Todays Past Orders: ");

   for (String i : Trans)

   System.out.println(counter + ". " + i.toString());
   counter++;

      }
   
}