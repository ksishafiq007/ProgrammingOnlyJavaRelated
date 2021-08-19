package programming;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int i, j, k, row = 7;
        for (i=0;i<row;i++){
            for (j=2*(row-1);j>=0;j--){
                System.out.print(" ");

            }
            for (k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
