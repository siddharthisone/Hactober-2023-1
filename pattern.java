public class pattern{
    public static void main(String[] args) {
        int n =4;

        for(int i =1;i<=n;i++)
        {
            for(int space =(n-i);space>0;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++ )
            {
                System.out.print(j);
            }
            for(int k =i-1;k>0;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
