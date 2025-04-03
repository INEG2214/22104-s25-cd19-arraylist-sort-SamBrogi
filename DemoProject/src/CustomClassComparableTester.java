import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomClassComparableTester {
    public static void main(String[] args)
    {

        CustomClassComparable ccc1 = new CustomClassComparable(10,"OK");
        CustomClassComparable ccc2 = new CustomClassComparable(50,"Help");
        CustomClassComparable ccc3 = new CustomClassComparable(25,"Test");

        ArrayList<CustomClassComparable> alCCC = new ArrayList<>();

        //Sort ArrayList of Custom Objects
        System.out.println("-----------------Sorting ArrayList of Custom Objects-------------------------------");
        System.out.println("ArrayList of Custom Objects before sort: " + alCCC.toString());



        System.out.println("ArrayList of Custom Objects after sort: "+ alCCC.toString());
        System.out.println("-----------------------------------------------------------------------------" +"\n");



    }
}
