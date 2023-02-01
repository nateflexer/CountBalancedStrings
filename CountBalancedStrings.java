import java.util.*;

public class CountBalancedStrings {
   static int balanceStr(String str1, int n){
      if (n == 0)
         return 0;
   
      int j=0;
      int l=0;
   
      int result = 0;
      for(int i = 0; i < n; i++)
      {
      
         if (str1.charAt(i) == 'R')
         {
            j++;
         }
         else if (str1.charAt(i) == 'L')
         {
            l++;
         }
      
        //solve returning result
         if (j == l) 
         {
            result++;
         }
      }
      return result;
   }
 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a bunch of 'L's' & 'R's': ");
      String str1 =sc.nextLine();
      int n = str1.length();
      System.out.print(balanceStr(str1, n) + "\n");
   }
}