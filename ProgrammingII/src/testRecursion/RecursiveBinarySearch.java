package testRecursion;
import java.util.Scanner;
public class RecursiveBinarySearch
{
   public static void main(String [] args)
   {
      int searchValue;  // The value to search for
      int result;       // The search result
      String input;     // A line of input
      char again;       // To hold a single character

      // The values in the following array are sorted
      // in ascending order.
      int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                       234, 289, 296, 310, 319, 388, 394,
                       417, 429, 447, 521, 536, 600};

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         System.out.print("Enter a value to " +
                          "search for: ");
         searchValue = keyboard.nextInt();

         result = binarySearch(numbers, 0, 
                               (numbers.length - 1),
                               searchValue);
         if (result == -1)
         {
            System.out.println(searchValue + 
                               " was not found.");
         }
         else
         {
            System.out.println(searchValue +
                               " was found at " +
                               "element " + result);
         }
         System.out.print("Do you want to search again? " +
                          "(Y or N): ");
         keyboard.nextLine();
         input = keyboard.nextLine();

      } while (input.charAt(0) == 'y' ||
               input.charAt(0) == 'Y');
   }

   /**
      The binarySearch method performs a binary search
      on an integer array. 
      @param array The array to search.
      @param first The first element in the search range.
      @param last The last element in the search range.
      @param value The value to search for.
      @return The subscript of the value if found,
              otherwise -1.
   */

   public static int binarySearch(int[] array, int first,
                                  int last, int value)
   {
      int middle;     // Mid point of search
        
      // Test for the base case where the
      // value is not found.
      if (first > last)
         return -1;
        
      // Calculate the middle position.
      middle = (first + last) / 2;
       
      // Search for the value.
      if (array[middle] == value)
         return middle;
      else if (array[middle] < value)
         return binarySearch(array, middle + 1,
                             last, value);
      else
         return binarySearch(array, first,
                             middle - 1, value);
   }
}