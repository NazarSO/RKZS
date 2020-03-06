package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double matrix[][] = new double[3][3];
        double matrix_copy1[][] = new double[3][3];
        double matrix_copy2[][] = new double[3][3];
        double matrix_copy3[][] = new double[3][3];
        double matrixTwo[][] = new double[3][3];

        double det, number;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matrix [" + i + "][" + j + "]= ");
                matrix[i][j] = in.nextDouble();
                matrix_copy1[i][j] = matrix[i][j];
                matrix_copy2[i][j] = matrix[i][j];
                matrix_copy3[i][j] = matrix[i][j];
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("MatrixTwo [" + i + "][" + j + "]= ");
                matrixTwo[i][j] = in.nextDouble();
            }
        }

        System.out.print("Number = ");
        number = in.nextDouble();

        matrix mat = new matrix();

        det = mat.det(matrix);
        System.out.print("Determinate = " + det + "\n\n");

        matrix = mat.Inversion(matrix);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("MatrixInversion = " + matrix[i][j] + "\n");
            }
        }
        System.out.print("\n");

        matrix_copy1 = mat.MultiplicationByMatrix(matrix_copy1, matrixTwo);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("MatrixMultiplication = " + matrix_copy1[i][j] + "\n");
            }
        }
        System.out.print("\n");

        matrix_copy2 = mat.AdditionByMatrix(matrix_copy2, matrixTwo);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("MatrixAddition = " + matrix_copy2[i][j] + "\n");
            }
        }
        System.out.print("\n");

        matrix_copy3 = mat.MultiplicationByNumber(matrix_copy3, number);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("MatrixMultiplicationByNumber = " + matrix_copy3[i][j] + "\n");
            }
        }
        System.out.print("\n");
    }
}

class matrix{

    double matrix[][] = new double[3][3];

    public double det(double matrix[][]){

        double determinant,x,y,z;

        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]));
        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]));
        determinant= x - y + z;

        return determinant;
    }

    public double[][] Inversion(double matrix[][]){
        int n = matrix.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i)
            b[i][i] = 1;

        // Transform the matrix into an upper triangle
        gaussian(matrix, index);

        // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k] -= matrix[index[j]][i]*b[index[i]][k];

        // Perform backward substitutions
        for (int i=0; i<n; ++i)
        {
            x[n-1][i] = b[index[n-1]][i]/matrix[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j)
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k)
                {
                    x[j][i] -= matrix[index[j]][k]*x[k][i];
                }
                x[j][i] /= matrix[index[j]][j];
            }
        }
        return x;
    }

    public static void gaussian(double a[][], int index[])
    {
        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i=0; i<n; ++i)
            index[i] = i;

        // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i)
        {
            double c1 = 0;
            for (int j=0; j<n; ++j)
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }

        // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j)
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i)
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1)
                {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i)
            {
                double pj = a[index[i]][j]/a[index[j]][j];

                // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

                // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }

    public double[][] MultiplicationByMatrix(double matrix[][], double matrixTwo[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] *= matrixTwo[i][j];
            }
        }
        return matrix;
    }

    public double[][] AdditionByMatrix(double matrix[][], double matrixTwo[][]){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] += matrixTwo[i][j];
            }
        }
        return matrix;
    }

    public double[][] MultiplicationByNumber(double[][] matrix, double number){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] *= number;
            }
        }
        return matrix;
    }
}
