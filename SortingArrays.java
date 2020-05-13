import java.util.*;
public class SortingArrays {

    public static void main(String[] arg){
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
//Add random numbers (between 1 and 100) into an array
      //  int ranNumber = Math.random(100); 
        for(int i = 1; i <= 100; i++)
        {int randomNumber = (int)(Math.random() * 100) + 1;
        listOfNumbers.add(randomNumber);}
        System.out.println("Original Array: \n"+listOfNumbers);

        System.out.println("Amount of values in this array: \n"+listOfNumbers.size());
//Sort in numerical order using the imported "Collection-class's sort() method"///////
        Collections.sort(listOfNumbers);
        System.out.println("Ascending Sorted Array \n"+listOfNumbers);
//Sort in descending numerical order using the imported "Collection-class's sort() method" then uses the "Collection-class's reverse() method"///////
        Collections.sort(listOfNumbers);
        Collections.reverse(listOfNumbers);
        System.out.println("Descending Sorted Array \n"+listOfNumbers);


    }
}