import static java.lang.Integer.parseInt;

public class Transpose {

    private int n;
    private int m;

    public Transpose(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public static int[] stringToInt (String input[],int l) {
        int[] inbox = new int[l+1];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            try {
                inbox[j] = parseInt(input[i]);
                j++;
                if (j>l){
                    inbox[l]=9;
                    return inbox;
                }
            } catch (NumberFormatException e) {
            }
        }
        if (j!=(l)) inbox[l]=9;
        return inbox;
    }
    public static int[][] intToMatrix(int input[], int i, int j) {
        System.out.println("Первоначальная матрица");
        int [][] matrix = new int[i][j];
        for (int a=0; a<i; a++){
            for (int b=0; b<j; b++) {
                matrix[a][b] = input[a*i+b];
                System.out.print(matrix[a][b]);
            }System.out.print("\n");
        }

        return matrix;
    }
    public static int[][] transpose(int[][] a, int n, int m) {
        int [][] transposedMatrix = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[i][j] = a[j][i];
            }
        }
        System.out.println();
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrix[i][j]);
            }
            System.out.println();
        }
        return transposedMatrix;
    }
}
