
import java.util.Scanner;


public class String_Permutation 
{
    static int count=0;
    public static void permute(String str,int i,int m)
    {
        char temp;
        if(i==m)
        {
            count++;
            System.out.print(str+" ");
        }
        else
        {
            for(int j=i;j<m;j++)
            {
                char[] c=str.toCharArray();
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                str=String.valueOf(c);
                permute(str,i+1,m);
                char[] a=str.toCharArray();
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                str=String.valueOf(a);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter testcases:");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter String");
            String str=sc.next();
            permute(str,0,str.length());
            System.out.println();
            System.out.print("Number of permutations = "+ count);
            System.out.println();
            
        }
        
    }
}
