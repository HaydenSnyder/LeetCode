public class RemoveDuplicates 
{
   // Create the Method to remove duplicates
   public static int removeDuplicates(int[] nums)
   {
      // Initialize k to 1, which will track the position of unique elements
      int k = 1;

      // Create a for loop, that goes through each number in the array starting from index 1
      for (int i = 1; i < nums.length; i++) 
      {
         // If the current number is not equal to the previous unique number, update the array
         if (nums[i] != nums[k - 1]) 
         {
             // Set the current number at position k
             nums[k] = nums[i];
             
             // Increment k to mark the next position for a unique element
             k++;
         }
      }
   
      // Return k, which is the number of unique elements in the array
      return k;        
   }
    
   public static void main(String[] args)
   {
      // Create an example array with duplicates
      int[] myArray = {0, 1, 1, 2};
     
      // Print the result of the removeDuplicates method, which returns the number of unique elements
      System.out.println(removeDuplicates(myArray));
   }
}
