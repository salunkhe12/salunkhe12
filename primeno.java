import java.util.*;
class primeno
{
 public static void main(String args [])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number do you want = ");
  int a = sc.nextInt();
  int count = 0;
  for(int i = 2; i < a; i++)
  {
   if(a % i == 0)
   {
    count++;
    break;
   }  
  }
   if(count == 0)
    System.out.println("\nIt is a Prime Number.");
   else
    System.out.println("\nIt is not a Prime Number.");
 }
}
