public class TwoDArrayDemo {
    public static void main(String[] args) {
        // Declare and Intialize the 2D array
        int[][] matrix= { {1,2,3}, {4, 5, 6}};

        // Print 2D array
        for(int rowIndex=0; rowIndex < matrix.length; rowIndex++){
            for (int colIndex=0; colIndex < matrix[rowIndex].length; colIndex++){
                System.out.print(matrix[rowIndex][colIndex] + "\t");
            }
            System.out.println(); // new line after each row
        }
    }
}
