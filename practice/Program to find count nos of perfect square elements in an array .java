import java.util.*;
public class Main
{
static int isPerfectSquare(int number){
   int iVar;
   float fVar;

  if(Math.sqrt(number) == Math.floor(Math.sqrt(number)))  
    return number;
  else 
    return 0;
}

public static void main(String[] args)
{
  int n, sum = 0;
  Scanner sc = new Scanner(System.in); 
  n = sc.nextInt();
  int[]arr = new int[n];
  for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
   }
   int count=0;
  for(int i = 0; i < n; i++){
   if(isPerfectSquare(arr[i])){
       count++;
   }
  }
  System.out.print(count);
 }
}