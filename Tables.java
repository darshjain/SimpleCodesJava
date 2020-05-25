class table
{
    public static void main(String[] args)
    {
        int rows=20,columns=20;
        int tab[][]=new int[rows+1][columns+1];
        System.out.println("Table is: ");
        int i,j;
        for(i=10;i<=rows;i++)
        {
            for(j=10;j<=columns;j++)
            {
                tab[i][j]=i*j;
                System.out.print(" " + tab[i][j]);
            }
            System.out.println(" ");
        }

    }
}