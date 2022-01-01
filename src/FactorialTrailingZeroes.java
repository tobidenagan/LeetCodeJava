public class FactorialTrailingZeroes {
    public static void main(String[] args) {
/*
        System.out.println(trailingZeroes(20));
*/
        trailingZeroes(20);
    }

    public static int trailingZeroes(int n){
        int count = 0;

        /*while(n>0){
            n/=5;
            count+=n;
        }*/

        while(n > 4) {
            n /= 5;
            System.out.println(n);
            count += n;
        }
        return count;
    }
}
