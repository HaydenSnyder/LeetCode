public class RemoveElement
{
   // Create the Method
   public static int remove(int[] nums, int val)
   {
      // Create k which is the total of val
      int k = 0;
      
      // Create a for loop that goes through each number in array
      for(int i =0; i < nums.length; i++)
      {
         // If the num at position i does not equal val
         if(nums[i] != val)
         {
            // Move the number at the current i position to k 
            nums[k] = nums[i];
            
            // Then add to k
            k++;
         }
      } 
      
      // Return the K value
      return k;
   } 
   
   public static void main(String[] args)
   {
      int[] myArray = {3,2,3,3,4};
      
      System.out.println(remove(myArray, 3));
   }
}