import java.util.Arrays;

class ContainsDuplicate 
{
   // Create Constructor Method
   public static boolean containsDuplicate(int[] nums) 
   {
      // Sort the numbers in order
      Arrays.sort(nums);
      
      // Create a for loop that goes through each number
      for (int i = 1; i < nums.length; i++) 
      {
         // Create a if statment that if num[i] is equal to the previous number
         if (nums[i] == nums[i - 1]) 
         {
            // Return true if so
            return true;
         }
      }
           
      // Return false if so
      return false;        
    }
    
    public static void main(String[] args)
    {
      int[] myArray = {0,1,2,3,4,0};
      int[] myArray1 = {1,2,3};
      
      System.out.println(containsDuplicate(myArray));
      System.out.println(containsDuplicate(myArray1));
      
    }
}