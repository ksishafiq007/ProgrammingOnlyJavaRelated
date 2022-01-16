package programming;

public class TransposeMatrix {
    public static void main(String[] args) {
        int original[][]={{2,4,6},{3,5,7},{4,6,8}};
        int transpose[][]=new int[3][3];  //3 rows and 3 columns

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("Print Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }

        System.out.println("Print Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
}
