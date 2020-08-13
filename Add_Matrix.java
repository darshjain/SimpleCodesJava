import java.util.Scanner;
import java.util.Arrays;
class Add_Matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,row,column,j;
        System.out.println("Enter number of rows and columns");
        row=sc.nextInt();
        column=sc.nextInt();

        int[][] a_array1=new int[row][column];
        int[][] b_array2=new int[row][column];
        int[][] outputmatrix=new int[row][column];

        System.out.println("Enter Elements of First Matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                a_array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements of Second Matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                b_array2[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE OUTPUT MATRIX IS: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                outputmatrix[i][j]=a_array1[i][j]+b_array2[i][j];
                System.out.print(" "+outputmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}