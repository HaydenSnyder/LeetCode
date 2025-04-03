public class TwoSum
{
   
   // Create the Method
   public static int[] twoSum(int[] nums, int target)
   {
      // Create a n where its the length of the array
      int n = nums.length;
      
      // Create a for loop that gets the first number, each time it will go down by 1 to the next number
      for(int i = 0; i < n - 1; i++)
      {
         // Create a for loop that holds the second number but adds + 1
         for(int j = i + 1; j < n; j++)
         {
            // If statement where if the num i and num j == target
            if(nums[i] + nums[j] == target)
            {
               // Return the new int i,j
               return new int[] {i,j};
            }
          }
      }
      
         // Throw an exception so that if it doesnt work 
         throw new IllegalArgumentException("No two sum solution");   
   }   

   public static void main(String[] args)
   {
      int[] nums = {2,7,11,15};
      int[] result1 = twoSum(nums, 9);
      System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");   
   }
}