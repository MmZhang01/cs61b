public class Collatz {

    public static int nextNumber(int n){

        if (n == 1){
            return n;
        }
        else if(n%2 == 0){
            return n/2;
        }
        return 3*n+1;
    }

    public static void main(String[] args){
        int n =5;
        System.out.println(n);
        while (n!=1){
            n=nextNumber(n);
            System.out.println(n);

        }

    }
}
