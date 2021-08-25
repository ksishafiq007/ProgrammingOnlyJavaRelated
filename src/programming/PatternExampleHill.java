package programming;

public class PatternExampleHill {
    public static void main(String[] args) {
        int i, j,n=8;          //n is the number of rows you want to print
        for(i=0;i<n;i++){
            int number=1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (j=0;j<=i;j++){
                System.out.printf("%4d", number);
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
