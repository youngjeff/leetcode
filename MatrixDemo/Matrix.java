package MatrixDemo;

public class Matrix {
    public static int [][] muliply (int[][] m1, int[][] m2){
        int m1rows = m1.length;
        int m1cols = m1[0].length;
        int m2rows = m2.length;
        int m2cols = m2[0].length;

        if(m1cols != m2rows)
        {
            throw new IllegalArgumentException("matrices don't match:" + m1cols + " != " + m2rows);
        }
        int[][] result = new int[m1rows][m2cols];

        for(int i=0;i<m1rows;i++)
        {
            for(int j=0;j<m2cols;j++)
            {
                for(int k=0;k<m1cols;k++)
                {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
    public static void mprint (int[][] a){
        int rows = a.length;
        int cols = a[0].length;
        System.out.println("array["+ rows+"]["+cols+"] = {" );
        for(int i=0;i<rows;i++)
        {
            System.out.print("{");
            for (int j=0;j<cols;j++)
                System.out.print(" "+ a[i][j] + ",");
            System.out.println("};");
        }
    }
}
