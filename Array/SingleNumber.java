public class SingleNumber 
{
   // Create the Method that takes in a array
   public int singleNumber(int[] nums) 
   {
      // Create a result
      int result = 0;
      
      // Create a for loop that goes through each number
      for(int i = 0; i < nums.length; i++)
      {
         // Make the result = result^nums[i], ^ = BitWise XOR operator which finds the single number in an array
         result = result^nums[i];
      }
      return result;
   }
   
   public static void main(String[] args)
   {
      int[] nums = {4, 1, 2, 1, 2};
      SingleNumber sn = new SingleNumber();
      System.out.println("Single number: " + sn.singleNumber(nums));
   }
}