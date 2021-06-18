package programming;

public class PrimeNumberUsingMethod {

    static void checkPrimeNumber(int n){

        int i,p=0,flag=0;
        p=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=p;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }

    public static void main(String[] args) {
        checkPrimeNumber(3);
        checkPrimeNumber(31);
        checkPrimeNumber(30);
        checkPrimeNumber(17);
        checkPrimeNumber(37);
    }
}
