import java.util.Scanner; 
 public class Main
{
  static  int mostfrequent(int arr[], int n,int freq[])
  {
    int max_count_idx=0;
    int curr_count =1;
    for(int i=0 ; i<n; i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i] == arr[j])
          curr_count ++;
    }
    freq[i] = curr_count;
    curr_count=1;
  }
   for(int i=0; i<n; i++)
   {
     if(freq[i]> freq[max_count_idx])
       max_count_idx=i;
   }
   return arr[max_count_idx];
 }
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i] =sc.nextInt();
  }
  int freq[] = new int[n];
  System.out.println(mostfrequent(arr,n,freq));
}
 }